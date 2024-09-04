package stxn.src;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private titleBar title;
    private btnPanel btnPanel;
    private list list;

    // Constructor
    public AppFrame(){
        this.setSize(400, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new titleBar();
        list = new list();
        btnPanel = new btnPanel();
        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
    }
}
