package View;

import javax.swing.*;

public class MovieFormPanel extends JPanel {

    JTextField titleField;
    JTextArea commentArea;
    JComboBox<Integer> ratingBox;
    JCheckBox favoriteBox;
    JButton saveButton;

    JPanel formPanel = new JPanel();

    public MovieFormPanel()
    {
        titleField = new JTextField(20);
        commentArea = new JTextArea(5, 20);
        ratingBox = new JComboBox<>(new Integer[]{1,2,3,4,5});
        favoriteBox = new JCheckBox("Favorite");
        saveButton = new JButton("Save");

        setMovieFormLayout();

    }

    private void setMovieFormLayout()
    {
        //setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        add(formPanel);

        formPanel.add(new JLabel("Title"));
        formPanel.add(titleField);
        formPanel.add(new JLabel("Rating"));
        formPanel.add(ratingBox);
        formPanel.add(favoriteBox);
        formPanel.add(new JLabel("Comment"));
        formPanel.add(commentArea);
        formPanel.add(saveButton);
    }

}
