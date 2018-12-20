package com.carshopwebapp.config;

import com.carshopwebapp.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class UsersLoginSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    LoginSecuritySimpleAuthenticationSuccessHandler loginSecuritySimpleAuthenticationSuccessHandler;

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyAuthority("Admin")
                //.permitAll().antMatchers("/welcome")
                .antMatchers("/showCreate").hasAnyAuthority("Admin")
                .antMatchers("/saveOwn").hasAnyAuthority("Admin")
                .antMatchers("/showCreateRepair").hasAnyAuthority("Admin")
                .antMatchers("/updateRepair").hasAnyAuthority("Admin")
                .antMatchers("/saveRepair").hasAnyAuthority("Admin")
                .antMatchers("/welcomeUser").hasAuthority("User")
                .antMatchers("/sintelestes").hasAuthority("Admin")
                .antMatchers("/welcomeAdmin").hasAuthority("Admin")
                .anyRequest().authenticated().and().formLogin()
                .successHandler(loginSecuritySimpleAuthenticationSuccessHandler)
                .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

}



