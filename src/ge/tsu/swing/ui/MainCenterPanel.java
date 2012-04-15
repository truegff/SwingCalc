package ge.tsu.swing.ui;

import ge.tsu.swing.MyFactoryImpl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MainCenterPanel extends JPanel {

	MyFactoryImpl fact = new MyFactoryImpl();
	private static final long serialVersionUID = -7074111768771839910L;

	public MainCenterPanel() {
		super();
		init();
	}

	public MainCenterPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		init();
	}

	public MainCenterPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		init();
	}

	public MainCenterPanel(LayoutManager layout) {
		super(layout);
		init();
	}

	private void init() {
		setBackground(Color.BLUE);
		setLayout(new BorderLayout());

		add(new KeypadEastPanel(), BorderLayout.EAST);
		add(new KeypadCenterPanel(), BorderLayout.CENTER);

		ActionListener al = fact.getActionListener();

		fact.getNum1().addActionListener(al);
		fact.getNum2().addActionListener(al);
		fact.getNum3().addActionListener(al);
		fact.getNum4().addActionListener(al);
		fact.getNum5().addActionListener(al);
		fact.getNum6().addActionListener(al);
		fact.getNum7().addActionListener(al);
		fact.getNum8().addActionListener(al);
		fact.getNum9().addActionListener(al);
		fact.getNum0().addActionListener(al);
		fact.getNumDot().addActionListener(al);
		fact.getNumEq().addActionListener(al);

		fact.getNumPlus().addActionListener(al);
		fact.getNumMinus().addActionListener(al);
		fact.getNumMultiply().addActionListener(al);
		fact.getNumDivide().addActionListener(al);
	}

}
