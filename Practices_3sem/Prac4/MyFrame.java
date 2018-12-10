package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    String team1 = "AC Milan";
    String team2 = "Real Madrid";
    int score1 = 0, score2 = 0;
    JLabel curr_score = new JLabel("<html><font size = +1>Result: " + score1 + "-" + score2 + "<font>");
    String curr_team = "MyTeam";
    JLabel last_scorer = new JLabel("<html><font size = +1>Last scorer: " + curr_team + "<font>");
    JLabel winner = new JLabel();


    MyFrame() {
        super("Picker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton button1 = new JButton("Pick: " + team1);
        JButton button2 = new JButton("Pick: " + team2);

        button1.setSize(160, 30);
        button1.setLocation(30, 100);
        button1.setBackground(Color.RED);
        button1.addActionListener(new ButtonEventListener1());
        panel.add(button1);

        button2.setSize(160, 30);
        button2.setLocation(300, 100);
        button2.setBackground(Color.WHITE);
        button2.addActionListener(new ButtonEventListener2());
        panel.add(button2);

        curr_score.setLocation(200, 50);
        curr_score.setSize(160, 40);
        panel.add(curr_score);

        last_scorer.setLocation(150, 150);
        last_scorer.setSize(250, 30);
        panel.add(last_scorer);

        winner.setLocation(150, 180);
        winner.setSize(250, 30);
        panel.add(winner);

        setContentPane(panel);
        setSize(500, 500);
        setVisible(true);
    }

    void whoIsTheWinner(){
        if(score1 == score2){ winner.setText("<html><font size = +1>Winner: DRAW" + "<font>"); }
        else if(score1 > score2){ winner.setText("<html><font size = +1>Winner: " + team1 + "<font>"); }
        else if(score1 < score2){ winner.setText("<html><font size = +1>Winner: " + team2 + "<font>"); }
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "1 point added to " + team1;
            score1++;
            curr_score.setText("<html><font size = +1>Result: " + score1 + "-" + score2 + "<font>");
            curr_team = team1;
            last_scorer.setText("<html><font size = +1>Last scorer: " + curr_team + "<font>");
            whoIsTheWinner();
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "1 point added to " + team2;
            score2++;
            curr_score.setText("<html><font size = +1>Result: " + score1 + "-" + score2 + "<font>");
            curr_team = team2;
            last_scorer.setText("<html><font size = +1>Last scorer: " + curr_team + "<font>");
            whoIsTheWinner();
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
