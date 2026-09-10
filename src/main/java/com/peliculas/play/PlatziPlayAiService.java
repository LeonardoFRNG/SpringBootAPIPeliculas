package com.peliculas.play;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

@AiService
public interface PlatziPlayAiService {

    @UserMessage ("""
                Genera un saludo de bienvenida a la plataforma de prueba: RiwiPlay.
                Contexto: es una plataforma de cine y peliculas.
                Usa menos de 120 caracteres y hazlo con el estilo de Platzi.
            """)
    String generateGreeting();
}
