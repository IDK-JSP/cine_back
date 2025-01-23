package org.example.domain.model;

public class Category {
    private String name;
    private boolean adult;
    private int id;

    // Constructeur
    public Category(String name, boolean adult, int id) {
        this.name = name;
        this.adult = adult;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;  // Pas besoin d'argument, retourne l'attribut title
    }

    public boolean getAdult() {
        return adult;  // Retourne l'attribut releaseYear
    }

    public int getId() {
        return id;  // Retourne l'attribut duration
    }

    // Méthode getDetails
    public String getDetails() {
        // Retourne une chaîne formatée avec le titre, l'année et la durée
        return name + " en adult " + adult + ", " + id;
    }
}
