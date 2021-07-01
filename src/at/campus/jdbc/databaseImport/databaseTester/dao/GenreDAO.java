package at.campus.jdbc.databaseImport.databaseTester.dao;


import at.campus.jdbc.databaseImport.databaseTester.model.Genre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {
    public List<Genre> getAllGenres() {

        List<Genre> genres = new ArrayList<>();

        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Genre");
            while (rs.next()) {
                Genre genre = new Genre(rs.getInt(1), rs.getString(2));

                genres.add(genre);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return genres;
    }

    private Connection getDBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseImportFilmGenre", "caruser", "caruser");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
