package com.hand.controller;

import com.hand.domain.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FilmRestController {
        @Autowired
        private FilmService filmService;

        @RequestMapping("/")
        public String adefault(){
            String info = "http://localhost:8080/api/film/\n";
            return info;
        }
        @RequestMapping("/testa")
        public String test(){
            return "test";
        }


        //通过id查找Film
        //curl $ curl http://localhost:8080/api/film/getbyid?film_id=3
        @RequestMapping(value ="/api/film/getbyid", method = RequestMethod.GET)
        public Film findOneFilm(@RequestParam("film_id") Integer film_id){
            return filmService.findFilmById(film_id);
        }

        //查找全部的Film
        //curl http://localhost:8080/api/film
        @RequestMapping(value = "/api/film",method = RequestMethod.GET)
        public List<Film> getAllFilm(){
            return filmService.findAllFilm();
        }

        //通过id删除Film
        //curl -X DELETE  http://localhost:8080/api/film?id=201
        @RequestMapping(value = "/api/film", method = RequestMethod.DELETE)
        public void daleteFilmById(@RequestParam("id")Integer id){
            filmService.deleteFilmById(id);
        }

        //添加一个Film
        //curl -H "Accept: application/json" -H "Content-type: application/json"
        // -X POST -d '{"first_name":"h","last_name":"xd"}'
        // http://localhost:8080/api/film
        @RequestMapping(value = "/api/film", method = RequestMethod.POST)
        public void addFilm(@RequestBody Film film){
            filmService.saveFilm(film);
        }

        //修改一个Film的信息
        //curl -H "Accept: application/json" -H "Content-type: application/json"
        // -X PUT -d '{"actor_id":'202',"first_name":"hx","last_name":"xd"}'
        // http://localhost:8080/api/film
        @RequestMapping(value = "/api/film", method = RequestMethod.PUT)
        public void updateFilm(@RequestBody Film film){
            filmService.updateFilm(film);
        }

}
