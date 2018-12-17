package com.carshopwebapp.config;

import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class UsersLoginSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    LoginSecuritySimpleAuthenticationSuccessHandler loginSecuritySimpleAuthenticationSuccessHandler;



    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                //.permitAll().antMatchers("/welcome")
                .hasAnyRole("USER", "ADMIN").antMatchers("/showCreate")
                .hasAnyRole("USER", "ADMIN").antMatchers("/saveOwn")
                .hasAnyRole("USER", "ADMIN").antMatchers("/showCreateRepair")
                .hasAnyRole("USER", "ADMIN").antMatchers("/updateRepair")
                .hasAnyRole("USER", "ADMIN").antMatchers("/saveRepair")
                .hasAnyRole("USER", "ADMIN").antMatchers("/welcomeUser")
                .hasAnyRole( "USER", "ADMIN").antMatchers("/welcomeAdmin")
                .hasAnyRole( "ADMIN").anyRequest().authenticated().and().formLogin()
                .successHandler(loginSecuritySimpleAuthenticationSuccessHandler)
                .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
      //  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       // String currentPrincipalName = authentication.getName();
//
        // System.out.println(service.getAllOwners().size());

        //System.out.println(service.getOwnersByEmail("katerina@ee.duth.gr"));
       /* for (int i=1;i<=service.getAllOwners().size();i++) {
            String a= service.getOwnerbyId(i).getKwdikoXristi();
            String b= service.getOwnerbyId(i).getAfm();
            System.out.println("(a,b)=("+a+","+b+")\n\n\n\n\n\n\n");
                }
*/

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        authenticationMgr.inMemoryAuthentication().passwordEncoder(encoder)
                .withUser("user").password(encoder.encode("user")).authorities("ROLE_USER")
                //.and()
               // .withUser("Papadopoylos").password(encoder.encode("aaa")).authorities("ROLE_USER")
                .and()
                .withUser("superuser").password(encoder.encode("superuser")).authorities("ROLE_USER", "ROLE_ADMIN");
    }

}



