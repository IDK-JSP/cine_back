package org.example.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.example.domain.model.Film;

public class FilmService {

    // variable temporaire pour stocker un jeu de films en local, sans la DB
    private List<Film> films = new ArrayList<>();

    // méthode temporaire pour avoir un jeu de films en local, sans la DB
    public void addFilms(List<Film> newFilms){
        films.addAll(newFilms);
    }

    public List<Film> listFilms() {
        // récupérer les films depuis DB
        return films;
    }

    public List<Film> searchFilms(String input) {
        List<Film> result = new ArrayList<>();

        for (Film film : films){
            if (film.getTitle().toLowerCase().contains(input.toLowerCase())){
                result.add(film);
            }
        }

        return result;
    }
}