package at.campus.basics.gui.newWindowProject;

import at.campus.basics.gui.firstProjectsGUI.MyFrame;

import javax.swing.*;

public class NewWindow {
    private MyFrame myFrame;
    private JLabel jLabel;

    public NewWindow() {
        this.myFrame = new MyFrame();
        this.jLabel = new JLabel();

        this.jLabel.setText("This is a new window!");
        this.jLabel.setOpaque(true);
        this.myFrame.add(jLabel);
    }
}
