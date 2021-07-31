package at.campus.basics.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TestClass {
    public static void main(String[] args) {
        /*create Border*/

        Border border = BorderFactory.createLineBorder(Color.white, 5);

        /*creating an ImageIcon*/

        ImageIcon icon = new ImageIcon("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\src\\at\\campus\\basics\\gui\\logo\\logoLetterA.jpg");

        /*create a label*/

        JLabel label = new JLabel();
        label.setText("JAVA EXERCISE");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBackground(Color.black);
        label.setOpaque(true);

        /*position the label*/

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        /*set border*/

        label.setBorder(border);

        /*set font color and size of text*/

        label.setForeground(Color.white);
        label.setFont(new Font("MV Boli", Font.HANGING_BASELINE, 20));

        /*set icon text gap*/

        label.setIconTextGap(50);

        /*creating a frame*/
        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("JAVA GUI");
        frame.add(label);
        frame.setVisible(true);

        /*change icon and background*/

        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(0xffffff));
    }
}
