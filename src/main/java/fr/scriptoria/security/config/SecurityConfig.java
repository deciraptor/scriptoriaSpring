package fr.scriptoria.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import fr.scriptoria.security.jwt.JWTAuthentificationFilter;
import fr.scriptoria.security.service.CustomUserDetailsService;

@Configuration // indique à Spring que cette classe est une classe de configuration
@EnableWebSecurity // active la sécurité web
public class SecurityConfig {

    //private final CustomUserDetailsService userDetailsService;

    public SecurityConfig(CustomUserDetailsService userDetailsService) {
        //this.userDetailsService = userDetailsService;
    }

    @Bean // ici on configure les accès aux ressources (API)
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()) // désactive la protection csrf

                .authorizeHttpRequests(
                        authz -> authz

                                .requestMatchers(HttpMethod.GET, "/api/public/**").permitAll() // autorise les requêtes
                                                                                               // GET sur /api/public/**

                                .requestMatchers(HttpMethod.POST, "/api/auth/**").permitAll()

                                .requestMatchers(HttpMethod.POST, "/api/project/**").permitAll()

                                .requestMatchers(HttpMethod.GET, "/api/user/**").hasAnyAuthority("AUTEUR", "COACH")

                                .requestMatchers(HttpMethod.GET, "/api/admin/**").hasAuthority("ADMIN")

                                .anyRequest().authenticated() // toutes les autres requêtes nécessitent une
                                                              // authentification
                ); // autorise toutes les requetes

        // http.httpBasic(Customizer.withDefaults()); // active l'authentification HTTP
        // de base

        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    // @Bean
    // public UserDetailsManager userDetailsManager() {

    // UserDetails user = User.builder()
    // .username("user")
    // .password("{noop}user") // noop indique que le mot de passe n'est aps crypté
    // .roles("USER")
    // .build();

    // UserDetails admin = User.builder()
    // .username("user")
    // .password("{noop}user") // noop indique que le mot de passe n'est aps crypté
    // .roles("USER")
    // .build();

    // return new InMemoryUserDetailsManager(user, admin);

    // }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JWTAuthentificationFilter jwtAuthenticationFilter() {
        return new JWTAuthentificationFilter();
    }

    @Bean // configuration de l' AuthenticationManager
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
