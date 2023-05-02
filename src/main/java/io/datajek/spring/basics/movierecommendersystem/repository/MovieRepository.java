package io.datajek.spring.basics.movierecommendersystem.repository;

import io.datajek.spring.basics.movierecommendersystem.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
