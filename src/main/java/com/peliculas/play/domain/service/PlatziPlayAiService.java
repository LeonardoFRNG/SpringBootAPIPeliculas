package com.peliculas.play.domain.service;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.UserMessage;

@AiService
public interface PlatziPlayAiService {

    @UserMessage ("""
                Genera un saludo de bienvenida a la plataforma de prueba: RiwiPlay.
                Contexto: es una ṕlataforma de peliculas y series online,
                 usa menos de 100 palabras, usa emojis y se creativo.
                 """)
    String generateGreeting();
}
