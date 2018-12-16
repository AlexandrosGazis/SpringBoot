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

/*    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");

    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                //.permitAll().antMatchers("/welcome")
                .hasAnyRole("User", "Administrator").antMatchers("/showCreate")
                .hasAnyRole("User", "Administrator").antMatchers("/saveOwn")
                .hasAnyRole("User", "Administrator").antMatchers("/showCreateRepair")
                .hasAnyRole("User", "Administrator").antMatchers("/updateRepair")
                .hasAnyRole("User", "Administrator").antMatchers("/saveRepair")
                .hasAnyRole("User", "Administrator").antMatchers("/welcomeUser")
                .hasAuthority("Administrator").antMatchers("/welcomeAdmin")
                .hasAnyRole( "Administrator").anyRequest().authenticated().and().formLogin()
                .successHandler(loginSecuritySimpleAuthenticationSuccessHandler)
                .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

/*    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
      //  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       // String currentPrincipalName = authentication.getName();
//
        // System.out.println(service.getAllOwners().size());

        //System.out.println(service.getOwnersByEmail("katerina@ee.duth.gr"));
       *//* for (int i=1;i<=service.getAllOwners().size();i++) {
            String a= service.getOwnerbyId(i).getKwdikoXristi();
            String b= service.getOwnerbyId(i).getAfm();
            System.out.println("(a,b)=("+a+","+b+")\n\n\n\n\n\n\n");
                }
*//*

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        authenticationMgr.inMemoryAuthentication().passwordEncoder(encoder)
                .withUser("user").password(encoder.encode("user")).authorities("ROLE_USER")
                .and()
                .withUser("katerina@ee.duth.gr").password(encoder.encode("aaa")).authorities("ROLE_USER")
                .and()
                .withUser("superuser").password(encoder.encode("superuser")).authorities("ROLE_USER", "ROLE_ADMIN");
    }*/

}



