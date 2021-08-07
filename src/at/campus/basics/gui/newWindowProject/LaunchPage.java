package at.campus.basics.gui.newWindowProject;

import at.campus.basics.gui.firstProjectsGUI.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    private MyFrame myFrame;
    private JButton button;
    private boolean hasNewWindow;

    public LaunchPage() {
        this.myFrame = new MyFrame();
        this.button = new JButton();

        this.button.setBounds(100, 160, 200, 40);
        this.button.setFont(new Font("cambria", Font.PLAIN, 21));
        this.button.setText("open new window");
        this.button.addActionListener(this);

        this.myFrame.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button && !hasNewWindow) {
            NewWindow newWindow = new NewWindow();
            hasNewWindow = true;
        }
    }
}
