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

    public void deleteFromGenreDB() {
        try {

            this.con = getDBConnection();
            Statement stmt = con.createStatement();
            //stmt.execute("delete  from Film");
            stmt.execute("delete  from Genre");


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void getAllGenres() {


        try {

            this.con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * Genre");
            while (rs.next()) {
//                Genre genre = new Genre(rs.getInt(1), rs.getString(2));
//                this.genres.add(genre);
                System.out.println(rs.getInt(1) + rs.getString(2));
            }
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("Exceptiontext: " + nfe);
        }

        try {
            stmt.setInt(1, genre.getId());
            stmt.setString(2, genre.getName());
            stmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NumberFormatException nx) {
            System.out.println("nx: " + nx);
        }


//        try {
//
//            this.con = getDBConnection();
//            Statement stmt = con.createStatement();
//            String sql = "insert ignore into Genre (id, name) values ('" + genre.getId() + "','" + genre.getName() + "')";
//            boolean result = stmt.execute(sql);
//
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

    }

    public void splitGenre(String name) {
        List<String> ssPlit = Arrays.asList(name.split(","));

        for (String s : ssPlit) {
            String sNew = s.trim().toLowerCase();
            if (this.uniqueGenre.contains(sNew)) {
                continue;
            } else {
                this.uniqueGenre.add(sNew);
            }
        }
    }

    public void outputUniqueGenres(){
        for (String s: this.uniqueGenre) {
            System.out.println(s);
        }
    }

}
