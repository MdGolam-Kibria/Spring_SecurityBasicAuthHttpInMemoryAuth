package com.example.besicHttpInMemoryAuth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigure extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                //i want to encode my password then below the line
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("kibria")
                .password("$2b$10$J8Sg0vRgCFnAs3HzP8qHq.IuoxtAZUKvns90pLYB7uuGxwWXSG.Jm")
                .roles("UESR")
                .and()
                .withUser("anika akter")
                .password("$2b$10$S227X/9lUBG1le/6GqQIk.nMwUHYDvqzkrdoFJ8lwxWYOgyD69EGi")
                .roles("Admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()//mane sobai ke / eta par hote parbe
                .anyRequest().authenticated() //ekhan theke jekono request access korte hole auth hoiya aste hobe
                .and()
                .httpBasic()
                .and()
                .exceptionHandling().accessDeniedPage("/403");//jodi kono vabe access na pai tahole kon page ta show korbe
                    // seta hundle korechi.
    }
}
