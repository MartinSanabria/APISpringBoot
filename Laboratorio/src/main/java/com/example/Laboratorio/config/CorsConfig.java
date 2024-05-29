package com.example.Laboratorio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Configura las rutas que deseas permitir CORS
                .allowedOrigins("file:///C:/Users/kikii/Desktop/Labo%20SpringBoot%20money/consumirAPI/index.html") // Reemplaza "your_frontend_port" con el puerto de tu frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                .allowedHeaders("*"); // Encabezados permitidos
    }
}
