package at.campus.jdbc.databaseImport.databaseTester;

import at.campus.jdbc.databaseImport.databaseTester.dao.FilmDAO;
import at.campus.jdbc.databaseImport.databaseTester.dao.GenreDAO;
import at.campus.jdbc.databaseImport.databaseTester.model.Film;
import at.campus.jdbc.databaseImport.databaseTester.model.Genre;

import java.io.*;

public class FilmTester {

    public static void main(String[] args) {

        try {
          BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DCV\\Coding Campus 2021\\01_Code\\my-first-projects\\movieDatabase.csv"));
//          BufferedWriter bw = new BufferedWriter((new FileWriter("movieDatabase.txt")));
            String sCurrentLine;
            GenreDAO gDAO = new GenreDAO();
            FilmDAO fDAO = new FilmDAO();

            // delete Data from DB

//            fDAO.deleteDataFromDB();
//            gDAO.deleteFromGenreDB();

            br.readLine();
            while ((sCurrentLine = br.readLine()) != null) {
                String[] ssPlit = sCurrentLine.split(";");

//                bw.write(sCurrentLine+"\n");
                try {
                    int id = Integer.parseInt(ssPlit[2]);
                    int year = Integer.parseInt(ssPlit[8]);
                    Film film = new Film(id,ssPlit[0],year);

                    fDAO.insertFilm(film);
                    System.out.println(film.getId() +" | "+ film.getTitle() + " | " + film.getYear());

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("Datensatz ist fehlerhaft");
                }

                try {
                    int id = Integer.parseInt(ssPlit[2]);
                    Genre genre = new Genre(id,ssPlit[13]);

                   gDAO.insertGenre(genre);
                    System.out.println(genre.getId() +" | "+ genre.getName());

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Datensatz ist fehlerhaft");
                }

            }
            br.close();
//            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
