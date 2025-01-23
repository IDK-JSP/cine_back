package org.example.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void testUserCreation() {
        User user = new User("toto@toto.com");

        // Vérifications des valeurs d'initialisation
        assertEquals("toto@toto.com", user.getEmail());
        assertNotNull(user.getViewedFilms());  // Vérifie que la liste des films vus n'est pas nulle
        assertNotNull(user.getFavoriteFilms());  // Vérifie que la liste des films favoris n'est pas nulle

        // Ajout de films à la liste des films vus
        Map<Film, Double> viewedFilms = user.getViewedFilms();
        Film filmToSearch = new Film("tototo", 1997, 90, "dkjhqjdh", 132);

        viewedFilms.put(new Film("Avatar", 2009, 162, "dkjhqjdh", 133), 9.0);
        viewedFilms.put(filmToSearch, 5.0);
        viewedFilms.put(new Film("tatata", 2023, 120, "dkjhqjdh", 134), 7.5);
        viewedFilms.put(new Film("lololo", 2020, 95, "dkjhqjdh", 135), null);
        viewedFilms.put(new Film("lalala", 1998, 100, "dkjhqjdh", 136), null);

        // Affichage de la taille de viewedFilms et des films ajoutés
        System.out.println("Taille de viewedFilms = " + viewedFilms.size());

        // Parcours de la Map pour afficher les films et leurs notes
        for (Map.Entry<Film, Double> entry : viewedFilms.entrySet()) {
            System.out.println("Film : " + entry.getKey().getTitle() + " | Note : " + entry.getValue());
        }

        // Recherche de la note d'un film
        Double noteToSearch = viewedFilms.get(filmToSearch);
        System.out.println("Note du film '" + filmToSearch.getTitle() + "' = " + noteToSearch);

        // Suppression du film de la Map
        viewedFilms.remove(filmToSearch);
        noteToSearch = viewedFilms.get(filmToSearch);
        System.out.println("Note du film '" + filmToSearch.getTitle() + "' après suppression = " + noteToSearch);

        // Affichage des notes restantes
        System.out.println("Notes restantes dans viewedFilms : ");
        for (Double note : viewedFilms.values()) {
            System.out.println(note);
        }

        // Vérification de la taille après suppression
        System.out.println("Taille de viewedFilms après suppression = " + viewedFilms.size());
    }
}
