package org.example.domain.model;

public class Film {
    private String title;
    private int releaseYear;
    private int duration;
    private String imagePath;
    private int id;

    // Constructeur
    public Film(String title, int releaseYear, int duration,String imagePath, int id) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.imagePath = imagePath;
        this.id = id;
    }

    // Getters
    public String getTitle() {
        return title;  // Pas besoin d'argument, retourne l'attribut title
    }

    public int getReleaseYear() {
        return releaseYear;  // Retourne l'attribut releaseYear
    }

    public int getDuration() {
        return duration;  // Retourne l'attribut duration
    }
    public String getImagePath(){
        return imagePath;
    }
    public int getId(){
        return id;
    }


    // Méthode getDetails
    public String getDetails() {
        // Retourne une chaîne formatée avec le titre, l'année et la durée
        return title + " (" + releaseYear + "), " + duration + " minutes";
    }
}
