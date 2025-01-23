package org.example.domain.model;

public class Actor {
    private String name;
    private boolean adult;
    private String birthDate;
    private int id;

    // Constructeur
    public Actor(String name, boolean adult,String birthDate , int id) {
        this.name = name;
        this.adult = adult;
        this.birthDate = birthDate;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;  // Pas besoin d'argument, retourne l'attribut title
    }

    public boolean getAdult() {
        return adult;  // Retourne l'attribut releaseYear
    }
    public String getBirthDate(){
        return birthDate;
    }
    public int getId() {
        return id;  // Retourne l'attribut duration
    }

    // Méthode getDetails
    public String getDetails() {
        // Retourne une chaîne formatée avec le titre, l'année et la durée
        return name + " en adult " + adult + " né le "+birthDate +", " + id;
    }
}
