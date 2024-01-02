//package io.datajek.spring.basics.movierecommendersystem.service;
//
//import io.datajek.spring.basics.movierecommendersystem.model.Movie;
//import io.datajek.spring.basics.movierecommendersystem.repository.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class MovieService {
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    public List<Movie> getMovies() {
//        List<Movie> moviesList = new ArrayList<>();
//        for (Movie movie : movieRepository.findAll()) {
//            moviesList.add(movie);
//        }
//        return moviesList;
//    }
//
//    public void insertMovie(Movie movie) {
//        movieRepository.save(movie);
//    }
//}
