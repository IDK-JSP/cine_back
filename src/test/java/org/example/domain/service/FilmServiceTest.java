package org.example.domain.service;

import org.example.domain.model.Film;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class FilmServiceTest {

    static List<Film> storedFilms;
    static FilmService filmService;
    static Film film1;
    static Film film2;
    static Film film3;
    static Film film4;
    static Film film5;
    static Film film6;

    @BeforeAll
    static void setup() {
        // Correction : Passer les paramètres imagePath et id lors de la création des films
        film1 = new Film("Avatar", 2009, 162, "path1", 1);
        film2 = new Film("Avatar2", 2022, 192, "path2", 2);
        film3 = new Film("tototo", 1997, 90, "path3", 3);
        film4 = new Film("tatata", 2023, 120, "path4", 4);
        film5 = new Film("lololo", 2020, 95, "path5", 5);
        film6 = new Film("lalala", 1998, 100, "path6", 6);

        // Initialisation de la liste des films stockés
        storedFilms = Arrays.asList(film1, film2, film3, film4, film5, film6);
        filmService = new FilmService();
        filmService.addFilms(storedFilms);  // Ajout des films au service
    }

    @Test
    void testListFilms() {
        // Récupération de la liste des films
        List<Film> films = filmService.listFilms();

        // Vérifications
        assertEquals(6, films.size());  // Vérifie qu'il y a bien 6 films
        assertEquals(storedFilms, films);  // Vérifie que la liste retournée correspond à celle attendue
    }

    @Test
    void testSearchFilms() {
        // Recherche des films contenant "Avatar" dans le titre
        List<Film> films = filmService.searchFilms("Avatar");

        // Vérifications
        assertEquals(Arrays.asList(film1, film2), films);  // Vérifie que les films "Avatar" sont retournés
    }

    @Test
    void testSearchFilmsCaseInsensitive() {
        // Recherche des films avec un mot-clé "avatar" (sans tenir compte de la casse)
        List<Film> films = filmService.searchFilms("avatar");

        // Vérifications
        assertEquals(Arrays.asList(film1, film2), films);  // Vérifie que les films "Avatar" sont retournés
    }

    @Test
    void testSearchFilmsOneLetter() {
        // Recherche des films contenant la lettre "o" dans leur titre
        List<Film> films = filmService.searchFilms("o");

        // Vérifications
        assertEquals(Arrays.asList(film3, film5), films);  // Vérifie que les films contenant "o" sont retournés
    }
}
