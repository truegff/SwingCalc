package ge.tsu.swing.ui;

import ge.tsu.swing.MyFactoryImpl;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class KeypadEastPanel extends JPanel {

        private MyFactoryImpl fact = new MyFactoryImpl();
	private static final long serialVersionUID = -1784948010030290016L;
	
	public KeypadEastPanel() {
		super();
		init();
	}

	public KeypadEastPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		init();
	}

	public KeypadEastPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		init();
	}

	public KeypadEastPanel(LayoutManager layout) {
		super(layout);
		init();
	}
	
	private void init() {
		setLayout(new GridLayout(4, 1));
		
        add(fact.getNumPlus());
		add(fact.getNumMinus());
		add(fact.getNumMultiply());
		add(fact.getNumDivide());	
	}
}
