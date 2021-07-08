package at.campus.jdbc.databaseImport.databaseTester.model;

public class FilmHasGenre {
    int idFilm;
    int idGenre;

    public FilmHasGenre(int idFilm, int idGenre) {
        this.idFilm = idFilm;
        this.idGenre = idGenre;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }
}
