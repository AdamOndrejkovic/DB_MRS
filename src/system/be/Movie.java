package system.be;

public class Movie {
    private final int id;
    private String title;
    private int year;

    public Movie(int id, String title, int year)
    {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.title + ", " + this.year;
    }

}
