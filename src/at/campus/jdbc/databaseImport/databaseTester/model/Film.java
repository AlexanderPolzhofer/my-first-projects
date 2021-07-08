package at.campus.jdbc.databaseImport.databaseTester.model;

public class Film {
    private int id;
    private String title;
    private String year;
    private String country;

    public Film(int id, String title, String year, String country) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
