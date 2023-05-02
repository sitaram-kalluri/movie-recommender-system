package io.datajek.spring.basics.movierecommendersystem.filter;

import io.datajek.spring.basics.movierecommendersystem.model.Movie;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements Filter {

    private static int instances = 0;

    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("Constructor is invoked");
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstance() {
        return ContentBasedFilter.instances;
    }
}
