package io.datajek.spring.basics.movierecommendersystem.exception;

public class InvalidMovieDetailsException extends RuntimeException {
    public InvalidMovieDetailsException(String missingMovieDetails) {
        super(missingMovieDetails);
    }
}
