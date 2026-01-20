package Model;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie)
    {
        movieList.add(movie);
    }

    public void removeMovie(Movie movie)
    {
        movieList.remove(movie);
    }

    public List<Movie> getMovieList()
    {
        return this.movieList;
    }

    public List<Movie> getAllFavorites(){
        return movieList.stream().filter(Movie::isFavorite).toList();
    }
}
