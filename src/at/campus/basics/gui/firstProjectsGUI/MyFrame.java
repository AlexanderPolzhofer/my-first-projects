package at.campus.basics.gui.firstProjectsGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.getContentPane().setBackground(new Color(0x123456));
        this.setSize(420, 420);
        this.setTitle("GUI");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
