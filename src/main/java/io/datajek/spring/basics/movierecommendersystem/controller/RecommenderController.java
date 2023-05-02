package io.datajek.spring.basics.movierecommendersystem.controller;

import io.datajek.spring.basics.movierecommendersystem.model.Movie;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;

public class RecommenderController {

    public List<Movie> getRecommendedMovies() {
        return new ArrayList<Movie>();
    }

}
