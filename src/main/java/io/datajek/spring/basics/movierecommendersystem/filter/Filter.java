package io.datajek.spring.basics.movierecommendersystem.filter;

public interface Filter {
    public String[] getRecommendations(String movie);
}
