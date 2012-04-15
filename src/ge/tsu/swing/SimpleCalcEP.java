package ge.tsu.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Simple A+B calculator EntryPoint
 * @author Alexander Dolidze <alexander.dolidze@gmail.com>
 */
public class SimpleCalcEP {

    public static JTextField veliA = new JTextField();
    public static JTextField veliB = new JTextField();
    public static JTextField sumField = new JTextField();

    public static JPanel fieldsPanel = new JPanel(new GridLayout(1, 3));
    public static JPanel buttonsPanel = new JPanel(new FlowLayout());

    public static JButton addButton = new JButton("Add");

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("My simple calc.");

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setMinimumSize(new Dimension(400, 70));

        mainFrame.setLayout(new BorderLayout());

        fieldsPanel.add(veliA);
        fieldsPanel.add(veliB);
        fieldsPanel.add(sumField);

        mainFrame.add(fieldsPanel, BorderLayout.NORTH);

        mainFrame.add(buttonsPanel, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Double x = 0.0, y = 0.0;

                try {
                    x = Double.parseDouble(veliA.getText());
                } catch (Exception e) {
                    veliA.setText("0");
                }

                try {
                    y = Double.parseDouble(veliB.getText());
                } catch (Exception e) {
                    veliB.setText("0");
                }

                sumField.setText(Double.toString(x.doubleValue()
                        + y.doubleValue()));

            }
        });

        buttonsPanel.add(addButton);

        mainFrame.setResizable(false);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}
