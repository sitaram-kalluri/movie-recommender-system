package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.config.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        ProductService productService = applicationContext.getBean(ProductService.class);
        System.out.println("Name of the product:" + productService.productName);
    }

}
