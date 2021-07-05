package at.campus.jdbc.databaseImport.databaseTester.dao;

import at.campus.jdbc.databaseImport.databaseTester.model.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
    List<Film> films = new ArrayList<>();

    public void deleteDataFromDB(){
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

    public List<Film> getAllFilms() {


        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Film");
            while (rs.next()) {
                Film film = new Film(rs.getInt(1), rs.getString(2), rs.getInt(3));

                this.films.add(film);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return films;
    }

    public void insertFilm(Film film) {
        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            String sql = "insert into Film (id, title, year) values ('" + film.getId() + "','" + film.getTitle() + "','" + film.getYear() + "')";
            boolean result = stmt.execute(sql);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


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
}
