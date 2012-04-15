package ge.tsu.swing.ui.listener;

import ge.tsu.swing.MyFactoryImpl;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

public class MainFrameKeyEventDispatcher implements KeyEventDispatcher {

	
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			new MyFactoryImpl().clear();
			return true;
		}
//		if (e.getKeyCode() == KeyEvent.VK_DELETE) {
//			new MyFactoryImpl().backspace();
//			return true;
//		}
		return false;
	}
}
