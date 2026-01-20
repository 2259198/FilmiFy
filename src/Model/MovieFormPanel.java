package Model;

import javax.swing.*;

public class MovieFormPanel extends JPanel {

    JTextField titleField;
    JTextArea commentArea;
    JComboBox<Integer> ratingBox;
    JCheckBox favoriteBox;
    JButton saveButton;


    public MovieFormPanel()
    {
        titleField = new JTextField(20);
        commentArea = new JTextArea(5, 20);
        ratingBox = new JComboBox<>();
        favoriteBox = new JCheckBox("Favorite");
        saveButton = new JButton("Save");

        add(new JLabel("Title"));
        add(titleField);
        add(new JLabel("Rating"));
        add(ratingBox);
        add(favoriteBox);
        add(new JLabel("Comment"));
        add(commentArea);
        add(saveButton);

    }

}
