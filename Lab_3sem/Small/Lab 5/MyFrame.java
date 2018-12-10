package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    int coord_x = 285;
    int coord_y = 50;
    int x = 215;
    int y = 150;
    int width = 800;
    int height = 600;
    JTextField curr_field;

    MyFrame() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel MyPanel = new JPanel();
        MyPanel.setLayout(null);
        MyPanel.setBackground(Color.YELLOW);

        Set_Calculator(MyPanel);

        //showing panel
        setContentPane(MyPanel);
        setSize(width, height);
        setResizable(false);
        setVisible(true);
    }

    void Set_Calculator(JPanel MyPanel){
        JLabel text1 = new JLabel("Element 1");
        text1.setBounds(coord_x - 135, coord_y - 40, 120, 40);
        JLabel text2 = new JLabel("Element 2");
        text2.setBounds(coord_x + 295, coord_y - 40, 120, 40);


        JTextField field1 = new JTextField(10);
        field1.setBounds(coord_x - 180, coord_y, 140, 40);
        field1.setBackground(Color.RED);
        field1.setHorizontalAlignment(JTextField.RIGHT);

        JTextField field2 = new JTextField(10);
        field2.setBounds(coord_x + 250, coord_y, 140, 40);
        field2.setBackground(Color.RED);
        field2.setHorizontalAlignment(JTextField.LEFT);

        curr_field = field1;


        JButton button_addiction = new JButton("+");
        JButton button_substruction = new JButton("-");
        JButton button_multiplication = new JButton("*");
        JButton button_division = new JButton("/");
        JButton button_sqrt = new JButton("sqrt");
        JButton button_qrt = new JButton("qrt");
        JButton button_next = new JButton(">> Next field >>");
        JButton clear_left = new JButton("Clear");
        JButton clear_right = new JButton("Clear");
        JButton delete_left = new JButton("<<");
        JButton delete_right = new JButton("<<");
        JButton button_point = new JButton(".");

        JButton Integral = new JButton("Integral");
        JButton Matrix = new JButton("Matrix");


        JButton[] numbers = new JButton[10];
        for(int i=0; i<10; i++){
            numbers[i] = new JButton(Integer.toString(i));
            numbers[i].setForeground(Color.YELLOW);
            numbers[i].setBackground(Color.BLUE);
            MyPanel.add(numbers[i]);
        }

        numbers[0].setBounds(x + 150, y + 250, 45, 45);
        numbers[1].setBounds(x + 100, y + 100, 45, 45);
        numbers[2].setBounds(x + 150, y + 100, 45, 45);
        numbers[3].setBounds(x + 200, y + 100, 45, 45);
        numbers[4].setBounds(x + 100, y + 150, 45, 45);
        numbers[5].setBounds(x + 150, y + 150, 45, 45);
        numbers[6].setBounds(x + 200, y + 150, 45, 45);
        numbers[7].setBounds(x + 100, y + 200, 45, 45);
        numbers[8].setBounds(x + 150, y + 200, 45, 45);
        numbers[9].setBounds(x + 200, y + 200, 45, 45);


        //options
        button_addiction.setBounds(coord_x, coord_y, 60, 30);
        button_addiction.setBackground(Color.GREEN);

        button_substruction.setBounds(coord_x + 150, coord_y, 60, 30);
        button_substruction.setBackground(Color.GREEN);

        button_multiplication.setBounds(coord_x, coord_y + 50, 60, 30);
        button_multiplication.setBackground(Color.GREEN);

        button_division.setBounds(coord_x + 150, coord_y + 50, 60, 30);
        button_division.setBackground(Color.GREEN);

        button_sqrt.setBounds(coord_x, coord_y + 100, 60, 30);
        button_sqrt.setBackground(Color.GREEN);

        button_qrt.setBounds(coord_x + 150, coord_y + 100, 60, 30);
        button_qrt.setBackground(Color.GREEN);

        button_next.setBounds(coord_x, coord_y + 150, 210, 30);
        button_next.setBackground(Color.GREEN);

        clear_left.setBounds(coord_x - 180, coord_y + 50, 80, 30);
        clear_left.setBackground(Color.RED);

        clear_right.setBounds(coord_x + 250, coord_y + 50, 80, 30);
        clear_right.setBackground(Color.RED);

        delete_left.setBounds(coord_x - 90, coord_y + 50, 50, 30);
        delete_left.setBackground(Color.RED);

        delete_right.setBounds(coord_x + 340, coord_y + 50, 50, 30);
        delete_right.setBackground(Color.RED);

        button_point.setBounds(x + 200, y + 250, 45, 45);
        button_point.setBackground(Color.BLUE);
        button_point.setForeground(Color.YELLOW);

        Integral.setBounds(x - 200, y + 350, 90, 45);
        Integral.setBackground(Color.GRAY);

        Matrix.setBounds(x - 200, y + 300, 90, 45);
        Matrix.setBackground(Color.GRAY);

        //addictions
        MyPanel.add(field1);
        MyPanel.add(field2);
        MyPanel.add(button_addiction);
        MyPanel.add(button_substruction);
        MyPanel.add(button_multiplication);
        MyPanel.add(button_division);
        MyPanel.add(button_sqrt);
        MyPanel.add(button_qrt);
        MyPanel.add(text1);
        MyPanel.add(text2);
        MyPanel.add(button_next);
        MyPanel.add(clear_left);
        MyPanel.add(clear_right);
        MyPanel.add(delete_left);
        MyPanel.add(delete_right);
        MyPanel.add(button_point);
        MyPanel.add(Integral);
        MyPanel.add(Matrix);


        button_addiction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(field1.getText().trim());
                    double x2 = Double.parseDouble(field2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + Math.rint(100.0 * (x1 + x2)) / 100.0, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    field1.setText(Double.toString(Math.rint(100.0 * (x1 + x2)) / 100.0));
                    field2.setText("");
                    curr_field = field1;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода!\n Попробуйте ещё раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                    field1.setText("");
                    curr_field = field1;
                }

            }
        });

        button_substruction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(field1.getText().trim());
                    double x2 = Double.parseDouble(field2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + Math.rint(100.0 * (x1 - x2)) / 100.0, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    field1.setText(Double.toString(Math.rint(100.0 * (x1 - x2)) / 100.0));
                    field2.setText("");
                    curr_field = field1;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода!\n Попробуйте ещё раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                    field1.setText("");
                    curr_field = field1;
                }
            }
        });

        button_multiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(field1.getText().trim());
                    double x2 = Double.parseDouble(field2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + Math.rint(100.0 * (x1 * x2)) / 100.0, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    field1.setText(Double.toString(Math.rint(100.0 * (x1 * x2)) / 100.0));
                    field2.setText("");
                    curr_field = field1;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода!\n Попробуйте ещё раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                    field1.setText("");
                    curr_field = field1;
                }
            }
        });

        button_division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(field1.getText().trim());
                    double x2 = Double.parseDouble(field2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + Math.rint(100.0 * (x1 / x2)) / 100.0, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    field1.setText(Double.toString(Math.rint(100.0 * (x1 / x2)) / 100.0));
                    field2.setText("");
                    curr_field = field1;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода!\n Попробуйте ещё раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                    field1.setText("");
                    curr_field = field1;
                }
            }
        });

        button_sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(field1.getText().trim());
                    double x2 = Double.parseDouble(field2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + Math.rint((100.0 * Math.pow(x1, 1.0 / x2))) / 100.0, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    field1.setText(Double.toString(Math.rint((100.0 * Math.pow(x1, 1.0 / x2))) / 100.0));
                    field2.setText("");
                    curr_field = field1;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода!\n Попробуйте ещё раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                    field1.setText("");
                    curr_field = field1;
                }
            }
        });

        button_qrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(field1.getText().trim());
                    double x2 = Double.parseDouble(field2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + Math.rint(100.0 * (Math.pow(x1, x2))) / 100.0, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    field1.setText(Double.toString(Math.rint(100.0 * (Math.pow(x1, x2))) / 100.0));
                    field2.setText("");
                    curr_field = field1;
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода!\n Попробуйте ещё раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                    field1.setText("");
                    curr_field = field1;
                }
            }
        });

        button_next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                curr_field = field2;
            }
        });

        clear_left.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
            }
        }));

        clear_right.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field2.setText("");
            }
        }));

        delete_left.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText().substring(0, field1.getText().length() - 1));
            }
        }));

        delete_right.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field2.setText(field2.getText().substring(0, field2.getText().length() - 1));
            }
        }));

        button_point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + ".");
            }
        });

        Integral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyPanel.removeAll();
                MyPanel.repaint();
                MyPanel.revalidate();
                Set_Integral(MyPanel);
            }
        });

        numbers[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "0");
            }

        });

        numbers[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "1");
            }
        });

        numbers[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "2");
            }

        });

        numbers[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "3");
            }
        });

        numbers[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "4");
            }
        });

        numbers[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "5");
            }
        });

        numbers[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "6");
            }
        });

        numbers[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "7");
            }
        });

        numbers[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "8");
            }
        });

        numbers[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = curr_field.getText();
                curr_field.setText(text + "9");
            }
        });
    }

    void Set_Integral(JPanel MyPanel){
        JLabel text1 = new JLabel("Element 1");
        text1.setBounds(coord_x - 100, coord_y - 20, 60, 40);
        JLabel text2 = new JLabel("Element 2");
        text2.setBounds(coord_x - 100, coord_y + 160, 60, 40);
        JLabel text3 = new JLabel("d");
        text3.setBounds(coord_x + 120, coord_y + 70, 60, 40);

        JTextField field1 = new JTextField(10);
        field1.setBounds(coord_x - 105, coord_y + 15, 70, 40);
        field1.setBackground(Color.RED);
        field1.setHorizontalAlignment(JTextField.RIGHT);

        JTextField field2 = new JTextField(10);
        field2.setBounds(coord_x - 105, coord_y + 125, 70, 40);
        field2.setBackground(Color.RED);
        field2.setHorizontalAlignment(JTextField.LEFT);

        JTextField field3 = new JTextField(10);
        field3.setBounds(coord_x - 90, coord_y + 70, 200, 40);
        field3.setBackground(Color.RED);
        field3.setHorizontalAlignment(JTextField.LEFT);

        JTextField field4 = new JTextField(10);
        field4.setBounds(coord_x + 130, coord_y + 70, 40, 40);
        field4.setBackground(Color.RED);
        field4.setHorizontalAlignment(JTextField.LEFT);

        MyPanel.add(text1);
        MyPanel.add(text2);
        MyPanel.add(text3);
        MyPanel.add(field1);
        MyPanel.add(field2);
        MyPanel.add(field3);
        MyPanel.add(field4);
    }
    void Set_Matrix(JPanel MyPanel){}
}
