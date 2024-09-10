
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CustomB implements ActionListener {

    JFrame csBFrame = new JFrame();
    JPanel csBPanel = new JPanel();

    JLabel csBLabel1 = new JLabel();
    JLabel csBLabel2 = new JLabel();

    JButton csBHButton = new JButton("Hours");
    JButton csBMButton = new JButton("Minutes");
    JButton csBSButton = new JButton("Seconds");
    JButton csBNxButton = new JButton("NEXT");
    JButton csBExButton = new JButton("BACK");

    JTextField csBHTF = new JTextField();
    JTextField csBMTF = new JTextField();
    JTextField csBSTF = new JTextField();

    CustomB() {

        csBLabel1.setBounds(180, 20, 400, 100);
        csBLabel1.setText("<html> Enter Break Time </html>");
        csBLabel1.setForeground(new Color(255,248,220));
        csBLabel1.setFont(new Font("MV Boli", Font.PLAIN, 30));

        csBHTF.setBounds(200, 150, 100, 35);
        csBHButton.setBounds(300, 150, 100, 35);

        csBMTF.setBounds(200, 220, 100, 35);
        csBMButton.setBounds(300, 220, 100, 35);

        csBSTF.setBounds(200, 290, 100, 35);
        csBSButton.setBounds(300, 290, 100, 35);

        csBNxButton.setBounds(200, 380, 200, 35);
        csBNxButton.setFocusable(false);
        csBNxButton.addActionListener(this);
        csBNxButton.setBackground(Color.BLACK);
        csBNxButton.setForeground(Color.WHITE);

        csBExButton.setBounds(200, 416, 200, 35);
        csBExButton.setFocusable(false);
        csBExButton.addActionListener(this);
        csBExButton.setBackground(Color.BLACK);
        csBExButton.setForeground(Color.WHITE);

        csBPanel.add(csBLabel1);

        csBPanel.add(csBHTF);
        csBPanel.add(csBMTF);
        csBPanel.add(csBSTF);

        csBPanel.add(csBHButton);
        csBPanel.add(csBMButton);
        csBPanel.add(csBSButton);
        csBPanel.add(csBNxButton);
        csBPanel.add(csBExButton);

        csBPanel.setBounds(0, 0, 600, 600);
        csBPanel.setLayout(null);
        // csBPanel.setBackground(new Color(46, 139, 87));
        csBPanel.setBackground(new Color(0,51,51));

        csBFrame.add(csBPanel);
        csBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        csBFrame.setSize(600, 600);
        csBFrame.setTitle("Custom Break");
        csBFrame.setResizable(false);
        csBFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == csBExButton) {
            csBFrame.dispose();
            // new CustomP();
            new CustomOption();
        }


        if(e.getSource()==csBNxButton)
        {
            int hhB = Integer.parseInt(csBHTF.getText());
            int mmB = Integer.parseInt(csBMTF.getText());
            int ssB = Integer.parseInt(csBSTF.getText());

           CustomBreak.cphours = hhB;
           CustomBreak.cpmin = mmB;
           CustomBreak.cpsec = ssB;

           csBFrame.dispose();
           new CustomBreak();

        }

    }
}
