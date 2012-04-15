/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.tsu.swing;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Lab-x-0
 */
public interface IMyFactory {
    JTextField getMainField();
    
    JButton getNum1();
    JButton getNum2();
    JButton getNum3();
    JButton getNum4();
    JButton getNum5();
    JButton getNum6();
    JButton getNum7();
    JButton getNum8();
    JButton getNum9();
    JButton getNum0();
    JButton getNumDot();
    JButton getNumEq();
    
    void clear();
//    void backspace();
    
    JButton getNumPlus();
    JButton getNumMinus();
    JButton getNumMultiply();
    JButton getNumDivide();    
    
    ActionListener getActionListener();
}
