package at.campus.jdbc.databaseImport.databaseTester;

import at.campus.jdbc.databaseImport.databaseTester.dao.FilmDAO;
import at.campus.jdbc.databaseImport.databaseTester.dao.FilmHasGenreDAO;
import at.campus.jdbc.databaseImport.databaseTester.dao.GenreDAO;
import at.campus.jdbc.databaseImport.databaseTester.model.Film;
import at.campus.jdbc.databaseImport.databaseTester.model.FilmHasGenre;
import at.campus.jdbc.databaseImport.databaseTester.model.Genre;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmTester {


    public static GenreDAO gDAO = new GenreDAO();
    public static FilmDAO fDAO = new FilmDAO();
    public static FilmHasGenreDAO fhgDAO = new FilmHasGenreDAO();

    public static void main(String[] args) {


        List<String> errorLine = new ArrayList<>();


        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\movieDatabase.csv"));
            String sCurrentLine;

            // delete Data from DB

//            fDAO.deleteDataFromDB();
//            gDAO.deleteFromGenreDB();

            String header = br.readLine();
            int i = 0;
            fDAO.getDBConnection();
            gDAO.getDBConnection();
            fhgDAO.getDBConnection();
            while ((sCurrentLine = br.readLine()) != null) {
                try {
                    i++;
                    String[] ssPlit = sCurrentLine.split(";");

                    int id = Integer.parseInt(ssPlit[2]);
                    String year = ssPlit[8];
                    String title = ssPlit[0];
                    String name = ssPlit[13];
                    String country = ssPlit[7];

                    title.replace("'", "");


                    Film film = new Film(id, title, year, country);

                    /*
                       Genres sind ja 'Action, Lieber'
                       split aufteilen in
                       Action
                       Lieber

                    String [] theGenres = name.split(",");
                    for (String s : theGenres) {
                        Genre genre = new Genre(i, s.trim());
                        i++;
                    }
                    */

                    // split Genres and insert into database table

//                    gDAO.splitGenre(name, film.getId());

                    // idea to insert into fhg table



//                    insertGenreInMain(genre, i);
//                    insertFilmInMain(film, i);


                } catch (NumberFormatException nx) {
                    System.out.println("nx" + nx);

                } catch (ArrayIndexOutOfBoundsException test) {
                    errorLine.add("Zeile: " + i);
                    System.out.println("x" + test);
                }


            }
            br.close();
            try {
                fDAO.getDBConnection().close();
                gDAO.getDBConnection().close();
                fhgDAO.getDBConnection().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
        System.out.println(errorLine);
//        gDAO.outputUniqueGenres();
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
            System.out.println(film.getId() + " | " + film.getTitle() + " | " + film.getYear() + " | " + film.getCountry());
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
