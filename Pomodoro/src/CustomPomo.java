import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomPomo implements ActionListener {

    JFrame cpFrame = new JFrame();
    JPanel cpPanel = new JPanel();
    JLabel cpTimerLabel = new JLabel();
    JLabel cpTitleLabel = new JLabel();

    JButton cpSButton = new JButton("START");
    JButton cpRButton = new JButton("RESET");
    JButton cpBButton = new JButton("BACK");
    JButton cpHButton = new JButton("HOME");

    ImageIcon cpimgP = new ImageIcon("Assets\\Clock (1).png");

    boolean cpisStarted = false;
    boolean cpisNt = false;

    public static int cphours = 0;
    public static int cpmin = 0;
    public static int cpsec = 0;

    int cptot = cphours * 3600 + cpmin * 60 + cpsec;

    String cphourString = String.format("%02d", cphours);
    String cpminString = String.format("%02d", cpmin);
    String cpsecString = String.format("%02d", cpsec);

    Timer cpTimer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            cptot--;
            if (cptot >= 0) {

                cphours = cptot / 3600;
                cpmin = (cptot - (cphours * 3600)) / 60;
                cpsec = (cptot - ((cphours * 3600) + (cpmin * 60))) % 60;

                String cphourString = String.format("%02d", cphours);
                String cpminString = String.format("%02d", cpmin);
                String cpsecString = String.format("%02d", cpsec);

                cpTimerLabel.setText(cphourString + ":" + cpminString + ":" + cpsecString);
            }

            else {
                if (cpisNt == false) {
                    cpisNt = true;
                    cpFrame.dispose();
                    new CSPomotoBreak();
                }
            }
        }
    });

    CustomPomo() {

        cpTitleLabel.setBounds(220, 20, 200, 180);
        cpTitleLabel.setIcon(cpimgP);

        cpTimerLabel.setText(cphourString + ":" + cpminString + ":" + cpsecString);

        cpTimerLabel.setBounds(200, 200, 200, 100);
        cpTimerLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
        cpTimerLabel.setBorder(BorderFactory.createBevelBorder(1));
        cpTimerLabel.setOpaque(true);
        cpTimerLabel.setHorizontalAlignment(JTextField.CENTER);

        cpSButton.setBounds(200, 300, 200, 50);
        cpSButton.addActionListener(this);
        cpSButton.setFocusable(false);

        // cpRButton.setBounds(300, 300, 100, 50);
        // cpRButton.addActionListener(this);

        cpBButton.setBounds(200, 400, 200, 50);
        cpBButton.setFocusable(false);
        cpBButton.addActionListener(this);
        cpBButton.setBackground(Color.BLACK);
        cpBButton.setForeground(Color.WHITE);

        cpHButton.setBounds(200, 450, 200, 50);
        cpHButton.setFocusable(false);
        cpHButton.addActionListener(this);
        cpHButton.setBackground(Color.BLACK);
        cpHButton.setForeground(Color.WHITE);

        cpPanel.add(cpTitleLabel);
        cpPanel.add(cpTimerLabel);

        cpPanel.add(cpSButton);
        cpPanel.add(cpRButton);
        cpPanel.add(cpBButton);
        cpPanel.add(cpHButton);

        cpPanel.setBounds(0, 0, 600, 600);
        cpPanel.setLayout(null);
        // cpPanel.setBackground(new Color(46, 139, 87));
        cpPanel.setBackground(new Color(0,51,51));

        cpFrame.add(cpPanel);
        cpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cpFrame.setSize(600, 600);
        cpFrame.setTitle("Custom Pomodoro");
        cpFrame.setResizable(false);
        cpFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cpSButton) {
            if (cpisStarted == false) {
                cpisStarted = true;
                cpSButton.setText("PAUSE");
                cpstart();
            } else {
                cpisStarted = false;
                cpSButton.setText("START");
                cpstop();
            }
        }

        if (e.getSource() == cpRButton) {
            cpisStarted = false;
            cpSButton.setText("START");
            cpreset();
        }

        if (e.getSource() == cpHButton) {
            cpFrame.dispose();
            new StartPage();
        }
        if (e.getSource() == cpBButton) {
            cpFrame.dispose();
            new CustomOption();
        }
    }

    void cpstart() {
        cpTimer.start();
    }

    void cpstop() {
        cpTimer.stop();
    }

    void cpreset() {
        cpTimer.stop();
        cphours = 0;
        cpmin = 0;
        cpsec = 0;
        // elapsedTime = 0;

        String cphoursString = String.format("%02d", cphours);
        String cpminString = String.format("%02d", cpmin);
        String cpsecString = String.format("%02d", cpsec);
        cpTimerLabel.setText(cphoursString + ":" + cpminString + ":" + cpsecString);

    }

}
