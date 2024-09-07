package stxn.src;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BtnPanel extends JPanel {
    private JButton addTask;
    private JButton clearCompletedTasks;


    // Border
    Border emptyBorder = BorderFactory.createEmptyBorder();
    Border allAroundBorder = BorderFactory.createMatteBorder(1, 1 , 1 ,1, Color.BLACK);

    // Constructor
    BtnPanel(){
        this.setPreferredSize(new Dimension(400, 30));

        // Add task Button

        addTask = new JButton("Add Task");
        addTask.setBorder(allAroundBorder);
        addTask.setPreferredSize(new Dimension(150, 20));
        addTask.setFont(new Font("Consolas", Font.BOLD, 15));

        // Clear finished tasks Button

        clearCompletedTasks = new JButton("Clear Completed");
        clearCompletedTasks.setPreferredSize(new Dimension(150, 20));
        clearCompletedTasks.setBorder(allAroundBorder);
        clearCompletedTasks.setFont(new Font("Consolas", Font.BOLD, 15));

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
