import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

public class StartPage implements ActionListener {

    JFrame stFrame = new JFrame();
    JPanel stPanel = new JPanel();
    JLabel stJLabel = new JLabel();
    JLabel desLabel1 = new JLabel();
    JLabel desLabel2 = new JLabel();
    JButton stButton = new JButton("START");
    JButton exButton = new JButton("EXIT");

    StartPage() {

        stJLabel.setBounds(0, 0, 600, 200);
        // stJLabel.setBackground(new Color(46, 139, 87));
        stJLabel.setBackground(new Color(0,51,51));
        stJLabel.setText("Getting Started");
        stJLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 45));
        // stJLabel.setForeground(new Color(255,255,255));
        stJLabel.setForeground(new Color(255,255,255));
        stJLabel.setOpaque(true);
        stJLabel.setHorizontalAlignment(JTextField.CENTER);

        desLabel1.setBounds(0, 201, 600, 35);
        desLabel1.setText("What is POMODORO?");
        desLabel1.setForeground(new Color(255, 248, 220));
        desLabel1.setFont(new Font("MV Boli", Font.PLAIN, 30));

        desLabel2.setBounds(10, 237, 585, 200);
        desLabel2.setText(
                "<html>The Pomodoro Technique is a time management method that involves working for 25-minute intervals, called \"Pomodoros,\" followed by a short break. This approach helps maintain focus and productivity while preventing burnout. After completing four Pomodoros, a longer break is taken to recharge.</html>");
        desLabel2.setFont(new Font("MV Boli", Font.PLAIN, 16));
        desLabel2.setForeground(new Color(160,160,160));

        stButton.setBounds(220, 450, 100, 40);
        stButton.setFocusable(false);
        stButton.setBackground(Color.BLACK);
        // stButton.setBackground(new Color(178,102,255));
        // stButton.setForeground(Color.black);
        stButton.setForeground(new Color(255,255,255));
        stButton.addActionListener(this);

        exButton.setBounds(220, 500, 100, 40);
        exButton.setFocusable(false);
        exButton.setBackground(Color.BLACK);
        exButton.setForeground(Color.WHITE);
        exButton.addActionListener(this);

        stPanel.add(desLabel1);
        stPanel.add(desLabel2);
        stPanel.add(stButton);
        stPanel.add(exButton);
        stPanel.add(stJLabel);
        stPanel.setBounds(0, 0, 600, 600);
        stPanel.setLayout(null);
        // stPanel.setBackground(new Color(46, 139, 87));
        stPanel.setBackground(new Color(0,51,51));



        stFrame.add(stPanel);
        stFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stFrame.setSize(600, 600);
        stFrame.setTitle("Pomodoro");
        stFrame.setResizable(false);
        stFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stButton) {
            
            stFrame.dispose();
            new OptionPage();
        }
        if(e.getSource()==exButton)
        {
            stFrame.dispose();
        }
    }
}
