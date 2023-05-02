package io.datajek.spring.basics.movierecommendersystem.controller;

import io.datajek.spring.basics.movierecommendersystem.exception.InvalidMovieDetailsException;
import io.datajek.spring.basics.movierecommendersystem.model.Movie;
import io.datajek.spring.basics.movierecommendersystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;


    @PutMapping("/addMovie")
    public void insertMovies(@RequestBody Movie movie) {
        if (movie.getName().isEmpty() || movie.getGenre().isEmpty() || movie.getProducer().isEmpty()) {
            throw new InvalidMovieDetailsException("Missing movie details");
        }
        movieService.insertMovie(movie);

    }

    @GetMapping("/getMovie")
    public List<Movie> getMovie() {
        return movieService.getMovies();
    }
}
