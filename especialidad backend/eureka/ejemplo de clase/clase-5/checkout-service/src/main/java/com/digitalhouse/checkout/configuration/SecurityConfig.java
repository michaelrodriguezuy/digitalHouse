package com.digitalhouse.checkout.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // con esta linea siguiente le estoy diciendo que endpoint quiero que puedan
                // acceder mediante esta medida de seguridad extra
                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers("/checkout/{id}").hasAnyAuthority("SCOPE_profile")
                                .anyRequest().authenticated())
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(jwt -> jwt
                                .jwkSetUri("http://localhost:8080/realms/test/protocol/openid-connect/certs")
                        // en este endpoint se encuentran los certificados publicos para validar el
                        // token
                        // teniendo esta informacion se va a poder comprobar por ejemplo, el rol de un
                        // usuario o su scope
                        ));
        return http.build();
    }
}
