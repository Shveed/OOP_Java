package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class MyFrame extends JFrame {
    int width = 400;
    int height = 300;
    int posX = 150;
    int posY = 100;
    Random rnd = new Random();
    int rand_int = rnd.nextInt(20);

    MyFrame() {
        super("Guesser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.RED);

        Set_Guesser(panel);
        setContentPane(panel);
        setSize(width, height);
        setResizable(false);
        setVisible(true);
    }
    void Check_Half(int x, int y){
        if(x < y){
            JOptionPane.showMessageDialog(null, "My number is bigger");
        }
        else if(x > y){
            JOptionPane.showMessageDialog(null, "My number is smaller");
        }
    }
    void Set_Guesser(JPanel panel) {
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////*Initializations*////////////////////////////////
        JLabel guess_text = new JLabel("<html><div style='text-align: center;'>I guessed a number(0-20). <br>Guess the number in 3 attempts</div><html>");
        guess_text.setBounds(posX - 50, posY - 60, 220, 70);
        JTextField number_field = new JTextField();
        number_field.setBounds(posX, posY, 80, 35);
        number_field.setBorder(BorderFactory.createEmptyBorder());
        JButton guess_button = new JButton("Guess it!");
        guess_button.setForeground(Color.RED);
        guess_button.setBorder(BorderFactory.createEmptyBorder());
        guess_button.setBounds(posX, posY + 50, 80, 35);
        panel.add(guess_text);
        panel.add(number_field);
        panel.add(guess_button);
        ///////////////////////////////////////////////////////////////////////////
        ///////////////////////////*Action Listeners*//////////////////////////////
        guess_button.addActionListener(new ActionListener() {
            int attempts = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                int last_entered;
                if(attempts < 4){
                    if(number_field.getText().equals("")){ JOptionPane.showMessageDialog(null, "Enter something!"); }
                    else{
                        if(Typetester.CheckInt(number_field.getText())) {
                            last_entered = Integer.parseInt(number_field.getText());
                            if(last_entered == rand_int){
                                JOptionPane.showMessageDialog(null, "You guessed it!");
                                dispose();
                            }
                            else{
                                Check_Half(last_entered, rand_int);
                                JOptionPane.showMessageDialog(null, "Try once again...");
                            }
                        }
                        else{ JOptionPane.showMessageDialog(null, "Wrong data!"); }
                    }
                }
                attempts++;
            }
        });
    }
}
