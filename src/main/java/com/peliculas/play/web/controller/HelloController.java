package com.peliculas.play.web.controller;

import com.peliculas.play.domain.service.PlatziPlayAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //sirve para marcar una clase como un controlador web capaz de crear APIs restful que devuelve datos directamente como JSON o XML en lugar de vistas HTML
public class HelloController {
    private final PlatziPlayAiService aiService;

    public HelloController(PlatziPlayAiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping ("/") //Sirve para mapear solicitudes GET a un metodo especifico dentro de un controlador
    public String hello() {
        return this.aiService.generateGreeting();
    }
}
