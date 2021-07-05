package at.campus.jdbc.databaseImport.databaseTester.dao;


import at.campus.jdbc.databaseImport.databaseTester.model.Film;
import at.campus.jdbc.databaseImport.databaseTester.model.Genre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {

    List<Genre> genres = new ArrayList<>();

    public void deleteFromGenreDB(){
        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            stmt.execute("delete  from Film");
            stmt.execute("delete  from Genre");


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public List<Genre> getAllGenres() {


        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * Genre");
            while (rs.next()) {
                Genre genre = new Genre(rs.getInt(1), rs.getString(2));
                this.genres.add(genre);

            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.genres;
    }

    private Connection getDBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseImportFilmGenre", "alex", "alex");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void insertGenre(Genre genre) {
        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            String sql = "insert ignore into Genre (id, name) values ('" + genre.getId() + "','" + genre.getName() + "')";
            boolean result = stmt.execute(sql);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
