package stxn.src;

import javax.swing.*;
import java.awt.*;

public class titleBar extends JPanel {
    // Constructor
    titleBar(){
        this.setPreferredSize(new Dimension(400, 40));
        this.setBorder(BorderFactory.createMatteBorder(0, 0 , 1 ,0, Color.BLACK));


        // Title text
        JLabel titleText = new JLabel("To Do List");
        titleText.setFont(new Font("Consolas", Font.BOLD, 30));

        this.add(titleText);

    }
}
