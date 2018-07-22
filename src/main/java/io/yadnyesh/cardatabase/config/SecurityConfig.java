package io.yadnyesh.cardatabase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }

//    @Override
//    public UserDetailsService userDetailsServiceBean() throws Exception {
//        UserDetails userDetails = User.withDefaultPasswordEncoder()
//                                        .username("user")
//                                        .password("password")
//                                        .roles("USER")
//                                        .build();
//        return new InMemoryUserDetailsManager(userDetails);
//    }


}
