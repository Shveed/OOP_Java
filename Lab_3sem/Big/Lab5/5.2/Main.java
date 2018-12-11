package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    JFrame jf = new JFrame("Тестовое окно");
    JButton jb1 = new JButton("Открыть");
    JButton jb2 = new JButton("Выход");

    public static void main(String[] args) {
        Main main = new Main();
        main.showImage();
    }

    public void showImage() {
        String file_path = "D:\\Java Files\\";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter image name");
        file_path += sc.nextLine();
        ImageIcon img = new ImageIcon(file_path);
        JLabel label = new JLabel(img);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setVisible(true);
        jf.setSize(800, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(label);
    }
}
