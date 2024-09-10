import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CustomP implements ActionListener {

    JFrame csFrame = new JFrame();
    JPanel csPanel = new JPanel();

    JLabel csLabel1 = new JLabel();
    JLabel csLabel2 = new JLabel();

    JButton csHButton = new JButton("Hours");
    JButton csMButton = new JButton("Minutes");
    JButton csSButton = new JButton("Seconds");
    JButton csNxButton = new JButton("NEXT");
    JButton csExButton = new JButton("BACK");

    JTextField csHTF = new JTextField();
    JTextField csMTF = new JTextField();
    JTextField csSTF = new JTextField();

    CustomP() {

        csLabel1.setBounds(150, 20, 400, 100);
        csLabel1.setText("<html> Enter Pomodoro Time </html>");
        csLabel1.setForeground(new Color(255,248,220));
        csLabel1.setFont(new Font("MV Boli", Font.PLAIN, 30));

        csHTF.setBounds(200, 150, 100, 35);
        csHButton.setBounds(300, 150, 100, 35);

        csMTF.setBounds(200, 220, 100, 35);
        csMButton.setBounds(300, 220, 100, 35);

        csSTF.setBounds(200, 290, 100, 35);
        csSButton.setBounds(300, 290, 100, 35);

        csNxButton.setBounds(200, 380, 200, 35);
        csNxButton.setFocusable(false);
        csNxButton.addActionListener(this);
        csNxButton.setBackground(Color.BLACK);
        csNxButton.setForeground(Color.WHITE);

        csExButton.setBounds(200, 416, 200, 35);
        csExButton.setFocusable(false);
        csExButton.addActionListener(this);
        csExButton.setBackground(Color.BLACK);
        csExButton.setForeground(Color.WHITE);

        csPanel.add(csLabel1);

        csPanel.add(csHTF);
        csPanel.add(csMTF);
        csPanel.add(csSTF);

        csPanel.add(csHButton);
        csPanel.add(csMButton);
        csPanel.add(csSButton);
        csPanel.add(csNxButton);
        csPanel.add(csExButton);

        csPanel.setBounds(0, 0, 600, 600);
        csPanel.setLayout(null);
        // csPanel.setBackground(new Color(46, 139, 87));
        csPanel.setBackground(new Color(0,51,51));

        csFrame.add(csPanel);
        csFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        csFrame.setSize(600, 600);
        csFrame.setTitle("Custom Pomodoro");
        csFrame.setResizable(false);
        csFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == csExButton) {
            csFrame.dispose();
            new OptionPage();
        }


        if(e.getSource()==csNxButton)
        {
            int hh = Integer.parseInt(csHTF.getText());
            int mm = Integer.parseInt(csMTF.getText());
            int ss = Integer.parseInt(csSTF.getText());

            CustomPomo.cphours = hh;
            CustomPomo.cpmin = mm;
            CustomPomo.cpsec = ss;
            csFrame.dispose();
            new CustomPomo();

        }

    }
}
