package io.datajek.spring.basics.movierecommendersystem.security;

import io.datajek.spring.basics.movierecommendersystem.security.entryPoint.CustomEntryPoint;
import io.datajek.spring.basics.movierecommendersystem.security.filter.CSRFFilterLogging;
import io.datajek.spring.basics.movierecommendersystem.security.handlers.CustomAuthenticationSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.jaas.AbstractJaasAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
public class LoginConfig {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().ignoringRequestMatchers("/h2-console","/h2-console/**");

        httpSecurity.httpBasic(c -> {
            c.realmName("SITARAM");
            c.authenticationEntryPoint(new CustomEntryPoint());
        });


        httpSecurity.addFilterAfter(new CSRFFilterLogging(), CsrfFilter.class)
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated();
        return httpSecurity.build();
    }


    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        System.out.println("This Authentication happen from Custom UserDetails Service" + this.toString());
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(new CustomUserDetailsService());
        daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        return daoAuthenticationProvider;
    }


    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(new CustomUser());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
