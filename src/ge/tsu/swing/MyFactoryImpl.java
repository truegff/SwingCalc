/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.tsu.swing;

import ge.tsu.swing.ui.listener.CustomActionListener;
import ge.tsu.swing.model.CalculationData;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * 
 * @author Lab-x-0
 */
public class MyFactoryImpl implements IMyFactory {

	private static JTextField textField = null;

	private static JButton num1 = null;
	private static JButton num2 = null;
	private static JButton num3 = null;
	private static JButton num4 = null;
	private static JButton num5 = null;
	private static JButton num6 = null;
	private static JButton num7 = null;
	private static JButton num8 = null;
	private static JButton num9 = null;
	private static JButton num0 = null;
	private static JButton numDot = null;
	private static JButton numEq = null;

	private static JButton numPlus = null;
	private static JButton numMinus = null;
	private static JButton numMultiply = null;
	private static JButton numDivide = null;

	private static ActionListener listener = null;

	@Override
	public JButton getNum1() {
		if (num1 == null)
			num1 = new JButton("1");
		return num1;
	}

	@Override
	public JButton getNum2() {
		if (num2 == null)
			num2 = new JButton("2");
		return num2;
	}

	@Override
	public JButton getNum3() {
		if (num3 == null)
			num3 = new JButton("3");
		return num3;
	}

	@Override
	public JButton getNum4() {
		if (num4 == null)
			num4 = new JButton("4");
		return num4;
	}

	@Override
	public JButton getNum5() {
		if (num5 == null)
			num5 = new JButton("5");
		return num5;
	}

	@Override
	public JButton getNum6() {
		if (num6 == null)
			num6 = new JButton("6");
		return num6;
	}

	@Override
	public JButton getNum7() {
		if (num7 == null)
			num7 = new JButton("7");
		return num7;
	}

	@Override
	public JButton getNum8() {
		if (num8 == null)
			num8 = new JButton("8");
		return num8;
	}

	@Override
	public JButton getNum9() {
		if (num9 == null)
			num9 = new JButton("9");
		return num9;
	}

	@Override
	public JButton getNum0() {
		if (num0 == null)
			num0 = new JButton("0");
		return num0;
	}

	@Override
	public JButton getNumDot() {
		if (numDot == null)
			numDot = new JButton(".");
		return numDot;
	}

	@Override
	public JButton getNumEq() {
		if (numEq == null)
			numEq = new JButton("=");
		return numEq;
	}

	@Override
	public JButton getNumPlus() {
		if (numPlus == null)
			numPlus = new JButton("+");
		return numPlus;
	}

	@Override
	public JButton getNumMinus() {
		if (numMinus == null)
			numMinus = new JButton("-");
		return numMinus;
	}

	@Override
	public JButton getNumMultiply() {
		if (numMultiply == null)
			numMultiply = new JButton("*");
		return numMultiply;
	}

	@Override
	public JButton getNumDivide() {
		if (numDivide == null)
			numDivide = new JButton("/");
		return numDivide;
	}

	@Override
	public ActionListener getActionListener() {
		if (listener == null)
			listener = new CustomActionListener();
		return listener;
	}

	@Override
	public JTextField getMainField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Arial", Font.BOLD, 32));
			textField.setEditable(false);
			textField.setHorizontalAlignment(JTextField.RIGHT);
		}
		return textField;
	}

	@Override
	public void clear() {
		CalculationData.reset();
		getMainField().setText("");
	}

//	@Override
//	public void backspace() {
//		if (getMainField().getText().length()>0) 
//			getMainField().setText(getMainField().getText().substring(0, getMainField().getText().length()-1));
//	}

}
