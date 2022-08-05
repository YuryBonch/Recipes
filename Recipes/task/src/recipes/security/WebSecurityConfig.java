package recipes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService) // user store DB
                .passwordEncoder(getEncoder());
        String str = "sss";
        str.l
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        final HttpBasicConfigurer<HttpSecurity> user = http.authorizeRequests()
                .mvcMatchers("/actuator/shutdown", "/h2","/api/register")
                .permitAll() // make remaining endpoints public (including POST /register)
                .anyRequest().authenticated()
                .and()
                .csrf().disable().headers().frameOptions().disable().and() // disabling CSRF will allow sending POST request using Postman
                .httpBasic();// enables basic auth.
    }


}
