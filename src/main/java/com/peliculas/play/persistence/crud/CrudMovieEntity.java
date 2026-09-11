package com.peliculas.play.persistence.crud;

import com.peliculas.play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

//Interfaz que hereda de CrudRepository para poder usar las diferentes operacines de crud de manera mas facil con Spring Boot <T, id> (nombre de entidad, tipo del id en este caso es tipo Long)
public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {

}
