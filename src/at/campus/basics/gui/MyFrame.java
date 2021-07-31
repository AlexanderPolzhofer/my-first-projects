package at.campus.basics.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.getContentPane().setBackground(new Color(0x123456));
        this.setSize(300, 600);
        this.setTitle("GUI");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
