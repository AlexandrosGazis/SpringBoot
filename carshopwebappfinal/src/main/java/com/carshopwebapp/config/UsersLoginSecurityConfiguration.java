package com.carshopwebapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
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
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/welcome")
                .hasAnyRole("USER", "ADMIN").antMatchers("/showCreate")
                .hasAnyRole("USER", "ADMIN").antMatchers("/saveOwn")
                .hasAnyRole("USER", "ADMIN").antMatchers("/showCreateRepair")
                .hasAnyRole("ADMIN").antMatchers("/saveRepair")
                .hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
                .successHandler(loginSecuritySimpleAuthenticationSuccessHandler)
                .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        authenticationMgr.inMemoryAuthentication().passwordEncoder(encoder)
                .withUser("user").password(encoder.encode("user")).authorities("ROLE_USER")
                .and()
                .withUser("superuser").password(encoder.encode("superuser")).authorities("ROLE_USER", "ROLE_ADMIN");
    }


 /*   @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
*/
}
/*

    @SuppressWarnings("deprecation")
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }


    @SuppressWarnings("deprecation")
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
    */




