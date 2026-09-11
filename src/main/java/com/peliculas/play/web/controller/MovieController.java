package com.peliculas.play.web.controller;

import com.peliculas.play.domain.dto.MovieDto;
import com.peliculas.play.domain.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/Movies")
    public List<MovieDto> getAll() {
        return this.movieService.getAll();
    }
}
