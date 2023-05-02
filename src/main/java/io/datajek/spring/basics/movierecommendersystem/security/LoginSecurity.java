package io.datajek.spring.basics.movierecommendersystem.security;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class LoginSecurity {

    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.
                authorizeHttpRequests().
                anyRequest().
                authenticated().
                and().
                httpBasic().
                and().build();
    }


}
