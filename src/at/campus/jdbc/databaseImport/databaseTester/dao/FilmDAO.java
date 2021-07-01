package at.campus.jdbc.databaseImport.databaseTester.dao;

import at.campus.jdbc.databaseImport.databaseTester.model.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {

    public List<Film> getAllFilms() {

        List<Film> films = new ArrayList<>();

        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Film");
            while (rs.next()) {
                Film film = new Film(rs.getInt(1), rs.getString(2), rs.getInt(3));

                films.add(film);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return films;
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
