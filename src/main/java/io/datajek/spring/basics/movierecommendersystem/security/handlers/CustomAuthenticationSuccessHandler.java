//package io.datajek.spring.basics.movierecommendersystem.security.handlers;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//import java.io.IOException;
//import java.util.List;
//
///// This is to customize the FORM-LOGIN
//public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//
//        var grantedAuthorities = authentication.getAuthorities();
//        var auth = grantedAuthorities.stream().filter(a -> a.getAuthority().equals("READ")).findFirst();
//        if (auth.isPresent()) {
//            response.sendRedirect("/home");
//        } else {
//            response.sendRedirect("/error");
//        }
//
//
//    }
//}
