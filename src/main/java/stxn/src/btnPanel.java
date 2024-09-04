package stxn.src;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class btnPanel extends JPanel {
    private JButton addTask;
    private JButton clearCompletedTasks;


    // Border
    Border emptyBorder = BorderFactory.createEmptyBorder();

    // Constructor
    btnPanel(){
        this.setPreferredSize(new Dimension(400, 30));

        // Add task Button

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Consolas", Font.BOLD, 20));

        // Clear finished tasks Button

        clearCompletedTasks = new JButton("Clear Completed");
        clearCompletedTasks.setBorder(emptyBorder);
        clearCompletedTasks.setFont(new Font("Consolas", Font.BOLD, 20));

        this.add(addTask);
        this.add(Box.createHorizontalStrut(20));
        this.add(clearCompletedTasks);

    }

    // Button returns

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClearCompletedTasks(){
        return clearCompletedTasks;
    }
}
