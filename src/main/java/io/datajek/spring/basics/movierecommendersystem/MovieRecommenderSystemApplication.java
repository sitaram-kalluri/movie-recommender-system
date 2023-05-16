package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    }

}
