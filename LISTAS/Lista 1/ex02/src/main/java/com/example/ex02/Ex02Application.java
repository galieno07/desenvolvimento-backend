package com.example.ex02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

   
    private static final double PRECO_POR_KM = 25.0;

    @GetMapping("/app/{quilometragem}")
    public String calcularPreco(@PathVariable double quilometragem) {
       
        double precoFinal = quilometragem * PRECO_POR_KM;

        
        return String.format("O preco final de sua expedicao eh: %.2f pratas", precoFinal);
    }
}