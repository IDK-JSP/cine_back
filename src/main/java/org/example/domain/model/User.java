package org.example.domain.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String email;
    private Map<Film, Double> viewedFilms;
    private List<Film> favoriteFilms;
    private List<Actor> favoriteActors;

    public User(String email) {
        this.email = email;
        this.viewedFilms = new HashMap<>();
        this.favoriteFilms = new ArrayList<>();
        this.favoriteActors = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public Map<Film, Double> getViewedFilms() {
        return viewedFilms;
    }

    public List<Film> getFavoriteFilms() {
        return favoriteFilms;
    }

    public List<Actor> getFavoriteActors() {
        return favoriteActors;
    }
}