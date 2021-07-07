package at.campus.jdbc.databaseImport.databaseTester;

import at.campus.jdbc.databaseImport.databaseTester.dao.FilmDAO;
import at.campus.jdbc.databaseImport.databaseTester.dao.GenreDAO;
import at.campus.jdbc.databaseImport.databaseTester.model.Film;
import at.campus.jdbc.databaseImport.databaseTester.model.Genre;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmTester {


    public static final GenreDAO gDAO = new GenreDAO();
    public static final FilmDAO fDAO = new FilmDAO();

    public static void main(String[] args) {


        List<String> erroLine = new ArrayList<>();


        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\movieDatabase.csv"));
            String sCurrentLine;

            // delete Data from DB

//            fDAO.deleteDataFromDB();
            gDAO.deleteFromGenreDB();

            String header = br.readLine();
            int i = 0;
            fDAO.getDBConnection();
            gDAO.getDBConnection();
            while ((sCurrentLine = br.readLine()) != null) {
                try {
                    i++;
                    String[] ssPlit = sCurrentLine.split(";");

                    int id = Integer.parseInt(ssPlit[2]);
                    String year = ssPlit[8];
                    String title = ssPlit[0];
                    String name = ssPlit[13];

                    title.replace("'", "");

                    Film film = new Film(id, title, year);
//                    Genre genre = new Genre(i, name);

                    gDAO.splitGenre(name);

//                    insertGenreInMain(genre, i);
//                    insertFilmInMain(film, i);


                } catch (NumberFormatException nx) {
                    System.out.println("nx" + nx);

                } catch (ArrayIndexOutOfBoundsException test) {
                    erroLine.add("Zeile: " + i);
                    System.out.println("x" + test);
                }


            }
            br.close();
            try {
                fDAO.getDBConnection().close();
                gDAO.getDBConnection().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
        System.out.println(erroLine);
        gDAO.outputUniqueGenres();
    }

    public static void insertGenreInMain(Genre genre, int i) {
        try {


            gDAO.insertGenre(genre);
            System.out.println(genre.getId() + " | " + genre.getName());

        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("Datensatz " + i + "  ist fehlerhaft, weil ; zu viel oder zu wenig");
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Datensatz " + i + " ist fehlerhaft, weil NumberFormatException");
        }

    }

    public static void insertFilmInMain(Film film, int i) {
        try {


            fDAO.insertFilm(film);
            System.out.println(film.getId() + " | " + film.getTitle() + " | " + film.getYear());
            //System.out.println(id+year+title);
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("Datensatz " + i + "  ist fehlerhaft");
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Datensatz " + i + " ist fehlerhaft, weil NumberFormatException");
        }

    }




}
