import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DefaultOption implements ActionListener {

    JFrame optnFrame = new JFrame();
    JPanel optnPanel = new JPanel();
    JButton optnButton1 = new JButton("Pomodoro");
    JButton optnButton2 = new JButton("Break");
    JButton opbButton = new JButton("BACK");
    JButton ophButton = new JButton("HOME");

    DefaultOption() {

        optnButton1.setBounds(200, 100, 200, 70);
        optnButton1.setFocusable(false);
        optnButton1.setFont(new Font("MV Boli", Font.PLAIN, 35));
        optnButton1.addActionListener(this);

        optnButton2.setBounds(200, 250, 200, 70);
        optnButton2.setFocusable(false);
        optnButton2.setFont(new Font("MV Boli", Font.PLAIN, 35));
        optnButton2.addActionListener(this);

        opbButton.setBounds(250, 380, 100, 30);
        opbButton.setFocusable(false);
        opbButton.addActionListener(this);
        opbButton.setBackground(Color.BLACK);
        opbButton.setForeground(Color.WHITE);

        ophButton.setBounds(250, 410, 100, 30);
        ophButton.setFocusable(false);
        ophButton.addActionListener(this);
        ophButton.setBackground(Color.BLACK);
        ophButton.setForeground(Color.WHITE);

        optnPanel.add(optnButton1);
        optnPanel.add(optnButton2);
        optnPanel.add(opbButton);
        optnPanel.add(ophButton);
        optnPanel.setBounds(0, 0, 600, 600);
        optnPanel.setLayout(null);
        // optnPanel.setBackground(new Color(46, 139, 87));
        optnPanel.setBackground(new Color(0,51,51));

        optnFrame.add(optnPanel);
        optnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        optnFrame.setSize(600, 600);
        optnFrame.setTitle("Default Options");
        optnFrame.setResizable(false);
        optnFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == opbButton) {
            optnFrame.dispose();
            new OptionPage();
        }
        if (e.getSource() == ophButton) {
            optnFrame.dispose();
            new StartPage();
        }
        if (e.getSource() == optnButton1) {
            optnFrame.dispose();
            new DefaultPomo();
        }

        if (e.getSource() == optnButton2) {
            optnFrame.dispose();
            new DefaultShortBreak();
        }
    }
}
