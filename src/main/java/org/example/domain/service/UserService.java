package org.example.domain.service;

import org.example.domain.model.Actor;
import org.example.domain.model.Film;
import org.example.domain.model.User;

public class UserService {
    public void addFilmToViewedList(User user, Film film) {
        user.getViewedFilms().put(film, null);
    }

    public void removeFilmFromViewedList(User user, Film film) {
        user.getViewedFilms().remove(film);
    }

    public void addFilmToFavoriteList(User user, Film film) {
        user.getFavoriteFilms().add(film);
    }

    public void removeFilmFromFavoriteList(User user, Film film) {
        user.getFavoriteFilms().remove(film);
    }

    public void addNoteToViewedFilm(User user, Film film, Double note) {
        user.getViewedFilms().put(film, note);
    }

    public void modifyNoteOfViewedFilm(User user, Film film, Double newNote) {
        user.getViewedFilms().put(film, newNote);
    }

    public void addActorToFavoriteList(User user, Actor actor) {
        user.getFavoriteActors().add(actor);
    }

    public void removeActorFromFavoriteList(User user, Actor actor) {
        user.getFavoriteActors().remove(actor);
    }
}