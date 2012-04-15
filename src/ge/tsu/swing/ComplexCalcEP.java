package ge.tsu.swing;

import ge.tsu.swing.ui.MainCenterPanel;
import ge.tsu.swing.ui.MyJFrame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * A+B, A-B, A/B, A*B calculator Entry Point
 * @author Alexander Dolidze <alexander.dolidze@gmail.com>
 */
public class ComplexCalcEP {
	static JFrame main = new MyJFrame("Calculator");
        private static MyFactoryImpl fact = new MyFactoryImpl();
	
	private static Runnable addUiComponents = new Runnable() {		
		@Override
		public void run() {
			main.add(fact.getMainField(), BorderLayout.NORTH);
			main.add(new MainCenterPanel(), BorderLayout.CENTER);
			
            main.pack();
            main.setVisible(true);
		}
	};
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(addUiComponents);
	}
}
