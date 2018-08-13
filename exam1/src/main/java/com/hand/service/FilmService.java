package com.hand.service;

import com.hand.domain.Film;

import java.util.List;

public interface FilmService {
    List<Film> findAllFilm();

    Film findFilmById(Integer actor_id);

    Integer saveFilm(Film film);

    Integer updateFilm(Film film);

    Integer deleteFilmById(Integer id);
}
