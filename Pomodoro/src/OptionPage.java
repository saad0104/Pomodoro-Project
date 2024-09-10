import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPage implements ActionListener {

    JFrame opFrame = new JFrame();
    JPanel opPanel = new JPanel();
    JLabel opJLabel1 = new JLabel();
    JLabel opJLabel2 = new JLabel();
    JButton opButton1 = new JButton();
    JButton opButton2 = new JButton();
    JButton opexButton = new JButton("EXIT");
    JButton opbButton = new JButton("BACK");

    OptionPage() {

        opButton1.setText("DEFAULT");
        opButton1.setBackground(Color.WHITE);
        // opButton1.setBackground(new Color(0,255,255));
        opButton1.setForeground(Color.BLACK);
        opButton1.setFocusable(false);
        opButton1.setBounds(250, 150, 100, 40);
        opButton1.addActionListener(this);

        opButton2.setText("CUSTOM");
        opButton2.setBackground(Color.WHITE);
        opButton2.setForeground(Color.BLACK);
        opButton2.setFocusable(false);
        opButton2.setBounds(250, 250, 100, 40);
        opButton2.addActionListener(this);

        opJLabel1.setBounds(20, 350, 350, 50);
        opJLabel1.setText("<html> DEFAULT : Sessions of 25 min and Breaks of 5 min. </html>");
        opJLabel1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        opJLabel1.setForeground(new Color(160,160,160));

        opJLabel2.setBounds(20, 421, 350, 50);
        opJLabel2.setText("<html> CUSTOM : Sessions and Breaks are customisable. </html>");
        opJLabel2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        opJLabel2.setForeground(new Color(160,160,160));



        opbButton.setBounds(200,490,100,40);
        opbButton.setFocusable(false);
        opbButton.addActionListener(this);
        opbButton.setBackground(Color.BLACK);
        opbButton.setForeground(Color.WHITE);

        opexButton.setBounds(300,490,100,40);
        opexButton.setFocusable(false);
        opexButton.addActionListener(this);
        opexButton.setBackground(Color.BLACK);
        opexButton.setForeground(Color.WHITE);

        opPanel.add(opJLabel1);
        opPanel.add(opJLabel2);
        opPanel.add(opButton1);
        opPanel.add(opButton2);
        opPanel.add(opbButton);
        opPanel.add(opexButton);
        opPanel.setBounds(0, 0, 600, 600);
        opPanel.setLayout(null);
        // opPanel.setBackground(new Color(46, 139, 87));
        opPanel.setBackground(new Color(0,51,51));

        opFrame.add(opPanel);
        opFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        opFrame.setSize(600, 600);
        opFrame.setResizable(false);
        opFrame.setTitle("Options");
        opFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == opButton1) {
            opFrame.dispose();
            new DefaultOption();
        }

        if (e.getSource() == opButton2) {
            opFrame.dispose();
            // new CustomP();
            new CustomOption();
        }

        if (e.getSource() == opbButton) {
            opFrame.dispose();
            new StartPage();
        }

        if (e.getSource() == opexButton) {
            opFrame.dispose();
        }
    }
}
