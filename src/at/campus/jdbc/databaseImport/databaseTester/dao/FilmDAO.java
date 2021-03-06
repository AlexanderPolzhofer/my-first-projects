package at.campus.jdbc.databaseImport.databaseTester.dao;

import at.campus.jdbc.databaseImport.databaseTester.model.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
    List<Film> films = new ArrayList<>();

    Connection con;

    public void deleteDataFromDB() {
        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            stmt.execute("delete from Film");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public List<Film> getAllFilms() {


        try {

            con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Film");
            while (rs.next()) {
                Film film = new Film(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

                this.films.add(film);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return films;
    }

    public void insertFilm(Film film) {

        PreparedStatement stmt = null;

        try {
            stmt = this.con.prepareStatement("insert into Film values (?,?,?,?)");
            stmt.setInt(1, film.getId());
            stmt.setString(2, film.getTitle());
            stmt.setString(3, film.getYear());
            stmt.setString(4, film.getCountry());
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseImportFilmGenre", "alex", "alex");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
