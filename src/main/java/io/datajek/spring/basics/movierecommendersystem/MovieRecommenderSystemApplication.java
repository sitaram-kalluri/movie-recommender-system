package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.recommender.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
        String[] result = recommenderImplementation.recommendMovies("Bahubali");
        System.out.println(Arrays.toString(result));
    }

}
