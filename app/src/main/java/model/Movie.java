package model;

public class Movie {
    private String title, thumbnailUrl, genre, realisateur, categorie, synopsis;
    private int year;

    public Movie() {
    }

    public Movie(String name, String thumbnailUrl, int year, double rating,
                 String genre, String realisateur, String categorie, String synopsis) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
        this.genre = genre;
        this.realisateur = realisateur;
        this.categorie = categorie;
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur){
        this.realisateur = realisateur;
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

}