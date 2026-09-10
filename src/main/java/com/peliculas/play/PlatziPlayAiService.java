package com.peliculas.play;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

@AiService
public interface PlatziPlayAiService {

    @UserMessage ("""
                Genera un saludo de bienvenida a la plataforma de prueba: RiwiSpace.
                Contexto: es una plataforma de aprendizaje dedicado a la astronomia, en cada actualizacion daras un dato curioso diferente acerca del espacio que enganche al publico,
                Cambia los emojis en cada actualizacion, usa tematica de astronomia.
                Usa menos de 400 caracteres y hazlo con el estilo de space x.
            """)
    String generateGreeting();
}
