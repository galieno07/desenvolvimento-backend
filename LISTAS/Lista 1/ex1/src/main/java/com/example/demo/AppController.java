package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
@RestController
@RequestMapping
public class AppController {

    @GetMapping("/app/{senha}")
    public String verificarSenha(@PathVariable String senha) {
       
        if ("senha123".equals(senha)) {
            return "Entrada autorizada";
        } else {
            return "Entrada não autorizada";
        }
    }

   
}