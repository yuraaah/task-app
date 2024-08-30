package stxn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton submitTaskButton;
    private JLabel headline;

    private JTextField addTaskField;

    int count = 0;

    public GUI()  {
        frame = new JFrame();
        headline = new JLabel("Task's to do!");

        // Submit button
        submitTaskButton = new JButton("Add Task");
        submitTaskButton.addActionListener(this);

        // Text field input
        addTaskField = new JTextField();
        addTaskField.setPreferredSize(new Dimension(250, 40));
        addTaskField.setFont(new Font("Consolas",Font.BOLD,30));
        addTaskField.setForeground(Color.white);
        addTaskField.setBackground(Color.black);
        addTaskField.setCaretColor(Color.white);



        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 100, 100 , 100));
        panel.setLayout(new FlowLayout());
        panel.add(headline);
        panel.add(addTaskField);
        panel.add(submitTaskButton);


        // Some default frame stuff
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("To Do List");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submitTaskButton){
            panel.add(new JTextField(addTaskField.getText()));
            System.out.println("Clicked!" + addTaskField.getText());
        }

    }
}

