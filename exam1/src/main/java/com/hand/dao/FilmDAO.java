package com.hand.dao;

import com.hand.domain.Film;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface FilmDAO {
    List<Film> findALLFilm();

    Film findFilmById(Integer film_id);

    Integer savaFilm(Film film);

    Integer updateFilm(Film film);

    Integer deleteFilmById(Integer film_id);
}
