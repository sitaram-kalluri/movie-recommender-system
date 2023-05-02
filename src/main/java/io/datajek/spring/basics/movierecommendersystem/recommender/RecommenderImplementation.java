package io.datajek.spring.basics.movierecommendersystem.recommender;

import io.datajek.spring.basics.movierecommendersystem.filter.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public void setFilter(@Qualifier("contentBasedFilter") Filter filter) {
        this.filter = filter;
        logger.info("Setter injection is invoked");
    }

    public String[] recommendMovies(String movieName) {
        return filter.getRecommendations(movieName);

    }
}
