package com.hand.service.impl;

import com.hand.dao.FilmDAO;
import com.hand.domain.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
@Autowired
private FilmDAO filmDAO;
    @Override
    public List<Film> findAllFilm() {
        return filmDAO.findALLFilm();
    }

    @Override
    public Film findFilmById(Integer film_id) {
        return filmDAO.findFilmById(film_id);
    }

    @Override
    public Integer saveFilm(Film film) {
        return filmDAO.savaFilm(film);
    }

    @Override
    public Integer updateFilm(Film film) {
        return filmDAO.updateFilm(film);
    }

    @Override
    public Integer deleteFilmById(Integer id) {
        return filmDAO.deleteFilmById(id);
    }
}
