//package io.datajek.spring.basics.movierecommendersystem.security.filter;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.web.csrf.CsrfToken;
//
//import java.io.IOException;
//
//public class CSRFFilterLogging implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        /*CsrfToken csrfToken = (CsrfToken) servletRequest.getAttribute("_csrf");
//        System.out.println("This CSRF Token: " + csrfToken.getToken());
//        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//        httpServletResponse.setHeader("X-CSRF-TOKEN", csrfToken.getToken());
//        filterChain.doFilter(servletRequest, servletResponse);*/
//    }
//}
