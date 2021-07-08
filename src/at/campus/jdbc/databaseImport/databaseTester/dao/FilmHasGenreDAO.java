package at.campus.jdbc.databaseImport.databaseTester.dao;

import at.campus.jdbc.databaseImport.databaseTester.model.Film;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilmHasGenreDAO {

    Connection con;

    public void insertFilmAndGenre(int filmId, int genreId) {

        PreparedStatement stmt = null;

        try {
            stmt = this.con.prepareStatement("insert into Film_has_Genre values (?,?)");
            stmt.setInt(1, filmId);
            stmt.setInt(2, genreId);
            stmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NumberFormatException nx) {
            System.out.println("nx" + nx);
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
}
