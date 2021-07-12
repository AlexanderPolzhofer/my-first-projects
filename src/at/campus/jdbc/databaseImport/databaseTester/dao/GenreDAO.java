package at.campus.jdbc.databaseImport.databaseTester.dao;


import at.campus.jdbc.databaseImport.databaseTester.model.Film;
import at.campus.jdbc.databaseImport.databaseTester.model.Genre;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenreDAO {

    List<Genre> genres = new ArrayList<>();
    List<String> uniqueGenre = new ArrayList<>();
    Connection con;
    int i = 1;

    public void deleteFromGenreDB() {
        try {
            this.con = getDBConnection();
            Statement stmt = con.createStatement();
            stmt.execute("delete from Genre");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Connection getDBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseImportFilmGenre", "alex", "alex");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void insertGenre(Genre genre) {

        PreparedStatement stmt = null;

        try {
            stmt = this.con.prepareStatement("insert into Genre values (?,?)");
            stmt.setInt(1, genre.getId());
            stmt.setString(2, genre.getName());
            stmt.execute();
        } catch (NumberFormatException nfe) {
            System.out.println("Exceptiontext: " + nfe);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    /*
    Suche Genres in unserer Genres Arraylist
     */

    private int searchGenres(String name) {
        for (Genre g : genres) {
            if (g.getName().equals(name)) return g.getId();
        }
        return -1;
    }

    public void splitGenre(String name, int filmID) {
        List<String> ssPlit = Arrays.asList(name.split(","));

        for (String s : ssPlit) {
            String sNew = s.trim().toLowerCase();
            int gId = searchGenres(sNew);
            if (gId < 0) {
                this.insertGenre(new Genre(this.i, sNew));
                this.genres.add(new Genre(this.i, sNew));
                gId = this.i;
            }

            // Datensatz ist vorhanden hier könnte ich gleich  Datensatz für movie-genre erstellen
            // insert into genremovie
            //

            this.i++;
        }
    }

    public void outputUniqueGenres() {
        for (String s : this.uniqueGenre) {
            System.out.println(s);
        }
    }

}
