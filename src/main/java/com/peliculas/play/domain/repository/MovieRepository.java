package com.peliculas.play.domain.repository;

import com.peliculas.play.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
