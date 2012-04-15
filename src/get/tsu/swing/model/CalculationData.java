package get.tsu.swing.model;

import javax.swing.JButton;

public class CalculationData {
	private static CalculationData cData = new CalculationData();
	
	public double mem = 0;
	public double lastInput = 0;
	public JButton lastActionButton;
	public JButton lastButton;
	public boolean dot;
	
	public static void reset() {
		cData = new CalculationData();
		cData.mem = 0;
		cData.lastInput= 0;
		cData.lastActionButton = null;
		cData.lastButton = null;
		cData.dot = false;
	}
	
	public static CalculationData get() {
		return cData;
	}
	
}
