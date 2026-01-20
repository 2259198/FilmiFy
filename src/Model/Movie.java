package Model;

public class Movie {

    protected String name;
    protected String comment;
    protected int rating;
    protected boolean favorite;

    public Movie(String name, String comment, int rating, boolean favorite)
    {
        this.name = name;
        this.comment = comment;
        this.rating = rating;
        this.favorite = favorite;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment()
    {
        return this.comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public int getRating()
    {
        return this.rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public boolean isFavorite()
    {
        return this.favorite;
    }

    public void setFavorite(boolean favorite)
    {
        this.favorite = favorite;
    }
}
