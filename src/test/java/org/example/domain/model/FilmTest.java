package org.example.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void testFilmCreation() {
        // Crée un film avec le titre, l'année et la durée
        Film film = new Film("Inception", 2010, 148, "imagePath",1555);

        // Teste que le titre, l'année et la durée sont corrects
        assertEquals("Inception", film.getTitle());
        assertEquals(2010, film.getReleaseYear());
        assertEquals(148, film.getDuration());
    }

    @Test
    void testGetDetails() {
        // Crée un film avec le titre, l'année et la durée
        Film film = new Film("Inception", 2010, 148, "imagePath",1555);


        // Teste que la méthode getDetails retourne la bonne chaîne formatée
        assertEquals("Inception (2010), 148 minutes", film.getDetails());
    }
}
