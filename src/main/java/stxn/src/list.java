package stxn.src;

import javax.swing.*;
import java.awt.*;

public class list extends JPanel {

    // Constructor
    list(){

        // Layout
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setBackground(Color.LIGHT_GRAY);
    }

    // Index numbers
    public void updateNumbers(){
         Component[] listItems = this.getComponents();

         for(int i = 0; i < listItems.length; i++){
             if (listItems[i] instanceof task){
                 ((task)listItems[i]).changeIndex(i);
             }
        }
    }

    // Remover of the completed tasks

    public void removeCompletedTasks() {
        for(Component c : getComponents()) {
            if(c instanceof task) {
                if(((task)c).getState()) {
                    remove(c);
                    updateNumbers();
                }
            }
        }
    }
}
