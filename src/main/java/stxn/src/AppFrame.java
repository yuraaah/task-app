package stxn.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private titleBar title;
    private btnPanel btnPanel;
    private list list;

    private JButton addTask;
    private JButton clearCompletedTasks;

    // Constructor
    public AppFrame(){
        this.setSize(400, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new titleBar();
        list = new list();
        btnPanel = new btnPanel();
        this.add(title, BorderLayout.NORTH); // Headline Title
        this.add(btnPanel, BorderLayout.SOUTH); // Bottom buttons
        this.add(list, BorderLayout.CENTER); // Panel for tasks

        addTask = btnPanel.getAddTask();
        clearCompletedTasks = btnPanel.getClearCompletedTasks();

        addListeners();

    }

    public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                // Adds tasks
                task task = new task();
                list.add(task);

                // updates list index numbers
                list.updateNumbers();


                // Marks done tasks
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        task.changeState();
                        revalidate();
                        super.mouseClicked(e);
                    }
                });

                // Clears marked as done tasks

                clearCompletedTasks.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        list.removeCompletedTasks();
                        revalidate();
                        super.mouseClicked(e);
                    }
                });

                revalidate();
                super.mouseClicked(e);
            }
        });
    }
}
