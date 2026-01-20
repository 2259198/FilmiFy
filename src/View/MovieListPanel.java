package View;

import Model.Movie;

import javax.swing.*;
import java.util.List;

public class MovieListPanel extends JPanel {
    private JList<Movie> movieJList;
    private DefaultListModel<Movie> listModel;

    public MovieListPanel() {
        listModel = new DefaultListModel<>();
        movieJList = new JList<>(listModel);
        add(new JScrollPane(movieJList));
    }

    public void updateMovies(List<Movie> movies) {
        listModel.clear();
        movies.forEach(listModel::addElement);
    }
}
