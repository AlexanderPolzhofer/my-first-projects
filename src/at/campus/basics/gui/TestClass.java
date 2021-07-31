package at.campus.basics.gui;

import javax.swing.*;
import java.awt.*;

public class TestClass {
    public static void main(String[] args) {

        /*Creating a frame*/
        JFrame frame = new JFrame();

        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("JAVA frame GUI");
        frame.setVisible(true);

        /*Creating an ImageIcon*/

        ImageIcon icon = new ImageIcon("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\src\\at\\campus\\basics\\gui\\logo\\logoLetterA.jpg");

        /*Change Icon and Background*/

        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));
    }
}
