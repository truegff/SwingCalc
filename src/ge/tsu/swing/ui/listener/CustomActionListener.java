package ge.tsu.swing.ui.listener;

import ge.tsu.swing.MyFactoryImpl;
import ge.tsu.swing.model.CalculationData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CustomActionListener implements ActionListener {

	private MyFactoryImpl fact = new MyFactoryImpl();
	
	CalculationData cdata = CalculationData.get();

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();

		if (b.equals(fact.getNum0())) {
			fact.getMainField().setText(fact.getMainField().getText() + "0");
		}
		if (b.equals(fact.getNum1())) {
			fact.getMainField().setText(fact.getMainField().getText() + "1");
		}
		if (b.equals(fact.getNum2())) {
			fact.getMainField().setText(fact.getMainField().getText() + "2");
		}
		if (b.equals(fact.getNum3())) {
			fact.getMainField().setText(fact.getMainField().getText() + "3");
		}
		if (b.equals(fact.getNum4())) {
			fact.getMainField().setText(fact.getMainField().getText() + "4");
		}
		if (b.equals(fact.getNum5())) {
			fact.getMainField().setText(fact.getMainField().getText() + "5");
		}
		if (b.equals(fact.getNum6())) {
			fact.getMainField().setText(fact.getMainField().getText() + "6");
		}
		if (b.equals(fact.getNum7())) {
			fact.getMainField().setText(fact.getMainField().getText() + "7");
		}
		if (b.equals(fact.getNum8())) {
			fact.getMainField().setText(fact.getMainField().getText() + "8");
		}
		if (b.equals(fact.getNum9())) {
			fact.getMainField().setText(fact.getMainField().getText() + "9");
		}
		if (b.equals(fact.getNumDot())) {
			if (!cdata.dot) {
				fact.getMainField()
						.setText(fact.getMainField().getText() + ".");
				cdata.dot = true;
			}
		}

		if (b.equals(fact.getNumPlus())) {
			Double current;
			try {
				current = Double.valueOf(fact.getMainField().getText());
			} catch (Exception ex) {
				current = 0.0;
			}
			fact.getMainField().setText("");
			cdata.lastActionButton = b;
			cdata.mem = current;
			cdata.dot = false;
		}
		if (b.equals(fact.getNumMinus())) {
			Double current;
			try {
				current = Double.valueOf(fact.getMainField().getText());
			} catch (Exception ex) {
				current = 0.0;
			}
			fact.getMainField().setText("");

			cdata.lastActionButton = b;
			cdata.mem = current;
			cdata.dot = false;
		}
		if (b.equals(fact.getNumMultiply())) {
			Double current;
			try {
				current = Double.valueOf(fact.getMainField().getText());
			} catch (Exception ex) {
				current = 0.0;
			}
			fact.getMainField().setText("");
			cdata.lastActionButton = b;
			cdata.mem = current;
			cdata.dot = false;

		}
		if (b.equals(fact.getNumDivide())) {
			Double current;
			try {
				current = Double.valueOf(fact.getMainField().getText());
			} catch (Exception ex) {
				current = 0.0;
			}
			fact.getMainField().setText("");
			cdata.lastActionButton = b;
			cdata.mem = current;
			cdata.dot = false;

		}
		if (b.equals(fact.getNumEq())) {
			double current;
			try {
				if (cdata.lastButton != b) {
					current = Double.valueOf(fact.getMainField().getText());
					cdata.lastInput = current;
				}				
			} catch (Exception ex) {
				// fact.getMainField().setText("0");
				// lastChange = 0.0;
			}
			//fact.getMainField().setText("");
			if (cdata.lastActionButton == fact.getNumPlus()) {
				cdata.mem += cdata.lastInput;
			}
			if (cdata.lastActionButton == fact.getNumMinus()) {
				cdata.mem -= cdata.lastInput;
			}
			if (cdata.lastActionButton == fact.getNumMultiply()) {
				cdata.mem *= cdata.lastInput;
			}
			if (cdata.lastActionButton == fact.getNumDivide()) {
				if (cdata.lastInput != 0) {
					cdata.mem /= cdata.lastInput;
				}
			}
			if (cdata.lastActionButton == null)
			{
				cdata.mem = cdata.lastInput;
			}
			fact.getMainField().setText(Double.toString(Math.round(cdata.mem*1000000.0)/1000000.0));
		}
		cdata.lastButton = b;
	}

}
