import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DFBreaktoPomo implements ActionListener {

    JFrame ptbFrame = new JFrame();
    JPanel ptbPanel = new JPanel();
    JLabel ptbLabel = new JLabel();
    JButton ptbBButton = new JButton("New Session");
    JButton ptbHButton = new JButton("HOME");

    DFBreaktoPomo() {

        ptbLabel.setBounds(100, 20, 500, 300);
        ptbLabel.setText("<html> Break Finished <BR> Let's get back to Work </html>");
        ptbLabel.setForeground(new Color(255,248,220));
        ptbLabel.setFont(new Font("MV Boli", Font.PLAIN, 35));

        ptbBButton.setBounds(200, 350, 200, 50);
        ptbBButton.addActionListener(this);
        ptbBButton.setFocusable(false);
        ptbBButton.setBackground(Color.BLACK);
        ptbBButton.setForeground(Color.WHITE);

        ptbHButton.setBounds(200, 400, 200, 50);
        ptbHButton.addActionListener(this);
        ptbHButton.setFocusable(false);
        ptbHButton.setBackground(Color.BLACK);
        ptbHButton.setForeground(Color.WHITE);

        ptbPanel.add(ptbBButton);
        ptbPanel.add(ptbHButton);
        ptbPanel.add(ptbLabel);
        ptbPanel.setBounds(0, 0, 600, 600);
        ptbPanel.setLayout(null);
        // ptbPanel.setBackground(new Color(46, 139, 87));
        ptbPanel.setBackground(new Color(0,51,51));

        ptbFrame.add(ptbPanel);
        ptbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ptbFrame.setSize(600, 600);
        ptbFrame.setTitle("DF Interval");
        ptbFrame.setResizable(false);
        ptbFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == ptbBButton) {
            ptbFrame.dispose();
            new DefaultPomo();
        }

        if (e.getSource() == ptbHButton) {
            ptbFrame.dispose();
            new StartPage();
        }

    }
}
