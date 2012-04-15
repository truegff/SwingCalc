package ge.tsu.swing.ui;

import ge.tsu.swing.MyFactoryImpl;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class KeypadCenterPanel extends JPanel {

	private MyFactoryImpl fact = new MyFactoryImpl();

	private static final long serialVersionUID = 3778313773698575098L;

	public KeypadCenterPanel() {
		init();
	}

	public KeypadCenterPanel(LayoutManager layout) {
		super(layout);
		init();
	}

	public KeypadCenterPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		init();
	}

	public KeypadCenterPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		init();
	}

	private void init() {
		setLayout(new GridLayout(4, 3));

		add(fact.getNum1());
		add(fact.getNum2());
		add(fact.getNum3());
		add(fact.getNum4());
		add(fact.getNum5());
		add(fact.getNum6());
		add(fact.getNum7());
		add(fact.getNum8());
		add(fact.getNum9());
		add(fact.getNum0());
		add(fact.getNumDot());
		add(fact.getNumEq());
	}

}
