package com.sougata.librarymsspringbootapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("Sougata Roy").password("1234").roles("1").build());
        manager.createUser(User.withUsername("Tapan Roy").password("1234").roles("0").build());
        return manager;
    }


    @Configuration
    @Order(1)
    public static class ApiAdminWebSeurityConfigurationAdapter extends WebSecurityConfigurerAdapter{
        protected void configure(HttpSecurity http) throws Exception{
            http
                    .antMatcher("/api/library/**")
                    .authorizeRequests()
                    .anyRequest().hasRole("1")
                    .and()
                    .httpBasic();
        }
    }

    @Configuration
    @Order(2)
    public static class ApiWebSeurityConfigurationAdapter extends WebSecurityConfigurerAdapter{
        protected void configure(HttpSecurity http) throws Exception{
            http
                    .antMatcher("/api/library/books/**")
                    .authorizeRequests()
                        .anyRequest().hasRole("0")
                        .and()
                    .httpBasic();
        }
    }

    @Configuration
    @Order(3)
    public static class FormLoginSecurityConfigurerAdpter extends WebSecurityConfigurerAdapter{

        @Override
        protected void configure(HttpSecurity http) throws Exception{
            http
                    .authorizeRequests()
                        .anyRequest().authenticated()
                        .and()
                    .formLogin();
        }
    }



    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .inMemoryAuthentication()
                    .withUser("Sougata Roy").password("1234").roles("1");
    }
}
