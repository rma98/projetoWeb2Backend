package br.edu.ifpe.gerenciadorSalas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Mapeia todas as rotas que começam com /api/
                .allowedOrigins("http://localhost:5173", "http://127.0.0.1:5500", "http://127.0.0.1:5501") // Permite solicitações dessas origens
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite os métodos
                .allowedHeaders("*") // Permite todos os cabeçalhos
                .allowCredentials(true); // Permite credenciais
    }
}
