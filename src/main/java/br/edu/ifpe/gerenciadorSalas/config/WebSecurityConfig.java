package br.edu.ifpe.gerenciadorSalas.config;

/*import br.edu.ifpe.gerenciadorSalas.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors() // Adiciona suporte a CORS
            .and()
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/usuarios").permitAll() // Permite acesso ao registro
                .requestMatchers("/api/login").permitAll() // Permite acesso ao login
                .anyRequest().authenticated() // Exige autenticação para qualquer outro endpoint
            )
            .csrf().disable() // Desabilita CSRF (não recomendado em produção)
            .formLogin(); // Habilita o formulário de login padrão do Spring Security
        return http.build();
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder
                .userDetailsService(customUserDetailsService)
                .passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }
}
*/