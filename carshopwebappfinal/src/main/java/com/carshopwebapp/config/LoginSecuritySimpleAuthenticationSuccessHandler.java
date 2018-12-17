package com.carshopwebapp.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@Component
public class LoginSecuritySimpleAuthenticationSuccessHandler implements AuthenticationSuccessHandler

    {
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication authentication)
            throws IOException, ServletException {

        //get user login name
        Authentication authentication2 = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication2.getName();



        Collection<?extends GrantedAuthority> authorities = authentication.getAuthorities();
        authorities.forEach(authority -> {
            if(authority.getAuthority().equals("ROLE_USER")) {
                try {
                    redirectStrategy.sendRedirect(arg0, arg1, "/welcomeUser");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                   // e.printStackTrace();
                    System.out.println("Check out this error1");
                }
            } else if(authority.getAuthority().equals("ROLE_ADMIN")) {
                try {
                    redirectStrategy.sendRedirect(arg0, arg1, "/");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                    System.out.println("Check out this error2");
                }
            } else {
                System.out.println("Check out this error3");
                throw new IllegalStateException();

            }
        });

    }

}
