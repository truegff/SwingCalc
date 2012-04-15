package ge.tsu.swing.ui;

import ge.tsu.swing.ui.layout.CustomBorderLayout;
import ge.tsu.swing.ui.listener.MainFrameKeyEventDispatcher;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.KeyboardFocusManager;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {

	private static final long serialVersionUID = -1790762669246150107L;

	public MyJFrame() throws HeadlessException {
		init();
	}

	public MyJFrame(GraphicsConfiguration gc) {
		super(gc);
		init();
	}

	public MyJFrame(String title) throws HeadlessException {
		super(title);
		init();
	}

	public MyJFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		init();
	}
	
	private void init() {
		
		//setFocusable(true);
		
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MainFrameKeyEventDispatcher());
        
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setMinimumSize(new Dimension(320, 238));
		setResizable(false);
		setLayout(new CustomBorderLayout());
	}

}
