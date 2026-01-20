package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable{

    MovieFormPanel movieFormPanel = new MovieFormPanel();
    MovieListPanel movieListPanel = new MovieListPanel();

    @Override
    public void run() {
        configurateFrameDetails();
        addOtherPanels();
        this.setVisible(true);
    }

    private void configurateFrameDetails()
    {
        setLayout(new BorderLayout());
        this.setTitle("FilmiFy");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addOtherPanels()
    {
        add(movieFormPanel);
        //add(movieListPanel);
    }
}
