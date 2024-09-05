package stxn.src;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

public class task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton taskDone;

    private boolean checked;

    // Constructor
    task(){
        this.setPreferredSize(new Dimension(40, 20));
        this.setLayout(new BorderLayout());

        // Index

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        // Task field

        taskName = new JTextField("Write your task here");
        taskName.setBorder(BorderFactory.createMatteBorder(2, 2 , 2 ,2, Color.BLACK));

        this.add(taskName, BorderLayout.CENTER);

        // Task Done
        taskDone = new JButton("Done");
        taskDone.setPreferredSize(new Dimension(40,20));
        taskDone.setBorder(BorderFactory.createEmptyBorder());

        this.add(taskDone, BorderLayout.EAST);

    }

    public JButton getDone(){
        return taskDone;
    }

    public void changeIndex(int num) {
        this.index.setText(num+"");
        this.revalidate();
    }

    public void changeState(){
        taskName.setBackground(Color.green);
        checked = true;
    }

    public boolean getState() {
        return checked;
    }
}
