import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.color.*;

public class DefaultShortBreak implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JLabel imgBLabel = new JLabel();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JButton homeButton = new JButton("HOME");
    JButton ShbButton = new JButton("BACK");

    ImageIcon imgB = new ImageIcon("Assets\\Break(1).png");


    boolean isStarted = false;
    boolean isNT = false;

    public int hours = 0;
    public int min = 5;
    public int sec = 0;

    int tot = (hours * 3600) + (min * 60) + sec;

    String hoursString = String.format("%02d", hours);
    String minString = String.format("%02d", min);
    String secString = String.format("%02d", sec);

    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            tot -= 1;

            if (tot >= 0) {
                hours = tot / 3600;
                min = (tot - (hours * 3600)) / 60;
                sec = (tot - ((hours * 3600) + (min * 60))) % 60;

                String hoursString = String.format("%02d", hours);
                String minString = String.format("%02d", min);
                String secString = String.format("%02d", sec);

                label.setText(hoursString + ":" + minString + ":" + secString);
            }

            else {
                if (isNT == false) {
                    isNT = true;
                    frame.dispose();
                    // new CSBreaktoPomo();
                    new DFBreaktoPomo();
                }
            }
        }
    });

    DefaultShortBreak() {

        imgBLabel.setBounds(220, 20, 200, 180);
        imgBLabel.setIcon(imgB);

        label.setText(hoursString + ":" + minString + ":" + secString);

        label.setBounds(200, 200, 200, 100);
        label.setFont(new Font("Verdana", Font.PLAIN, 35));
        label.setBorder(BorderFactory.createBevelBorder(1));
        label.setOpaque(true);
        label.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(200, 300, 200, 50);
        startButton.addActionListener(this);
        startButton.setFocusable(false);

        // resetButton.setBounds(300, 300, 100, 50);
        // resetButton.addActionListener(this);


        ShbButton.setBounds(200, 400, 200, 50);
        ShbButton.addActionListener(this);
        ShbButton.setFocusable(false);
        ShbButton.setBackground(Color.BLACK);
        ShbButton.setForeground(Color.WHITE);


        homeButton.setBounds(200, 450, 200, 50);
        homeButton.addActionListener(this);
        homeButton.setFocusable(false);
        homeButton.setBackground(Color.BLACK);
        homeButton.setForeground(Color.WHITE);
       
        panel.add(startButton);
        // panel.add(resetButton);
        panel.add(ShbButton);
        panel.add(homeButton);
        panel.add(imgBLabel);
        panel.add(label);

        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(null);
        // panel.setBackground(new Color(46, 139, 87));
        panel.setBackground(new Color(0,51,51));
       
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setTitle("Default Break");
        frame.setResizable(false);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (isStarted == false) {
                isStarted = true;
                startButton.setText("PAUSE");
                start();
            } else {
                isStarted = false;
                startButton.setText("START");
                stop();
            }
        }
        // if (e.getSource() == resetButton) {
        //     isStarted = false;
        //     startButton.setText("START");
        //     reset();

        // }
        if (e.getSource() == homeButton) {
            frame.dispose();
            new StartPage();
        }
        if (e.getSource() == ShbButton) {
            frame.dispose();
            new DefaultOption();
        }
        


    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    // void reset() {
    //     timer.stop();
    //     hours = 0;
    //     min = 5;
    //     sec = 0;
    //     // elapsedTime = 0;

    //     String hoursString = String.format("%02d", hours);
    //     String minString = String.format("%02d", min);
    //     String secString = String.format("%02d", sec);
    //     label.setText(hoursString + ":" + minString + ":" + secString);

    // }

}
