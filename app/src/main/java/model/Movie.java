package model;

import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;

public class Movie {
    private String title, thumbnailUrl, genre, realisateur, categorie, synopsis, year, length;
    private JSONArray media;

    public Movie() {
    }

    public Movie(String name, String thumbnailUrl, String year, String length,
                 String genre, String realisateur, String categorie, String synopsis, JSONArray media) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
        this.genre = genre;
        this.realisateur = realisateur;
        this.categorie = categorie;
        this.synopsis = synopsis;
        this.length = length;
        this.media =  media;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public void setLength(String length){
        this.length = length;
    }
    public String getLength(){
        return length;
    }

    public JSONArray getMedia(){
        return media;
    }
    public void setMedia(JSONArray media){
        this.media = media;
    }
}