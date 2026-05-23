package com.example.cadastro_aluno;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/cadastro")
    public String cadastro(
        @RequestParam String nome, 
        @RequestParam String curso,
        @RequestParam double nota,
        @RequestParam int idade,
        @RequestParam String cidade 
    ){
       String status;
       if (nota >= 7) {
           status = "Aprovado";
       } else {
           status = "Reprovado";
         }



        String classStatus;
        if (nota >= 7) {
            classStatus = "Parabéns! Você foi aprovado.";
        } else {
            classStatus = "Infelizmente, você foi reprovado. Tente novamente.";
        }

       return"""
       <html>
       <head>
       <link rel="stylesheet" href="/style.css">
       <title>Resultado</title>
       </head>
       <body>
       <div class='resultado'>
       <h1>Cadastro realizado!</h1>
       <p><strong>Nome:</strong> %s</p>
         <p><strong>Curso:</strong> %s</p>
            <p><strong>Nota:</strong> %.1f</p>
            <p><strong>Idade:</strong> %s</p>
            <p><strong>Cidade:</strong> %s</p>
        <p class='status'>%s</p>
        </div>
        </body>
        </html>
         """.formatted(nome, curso, nota, idade, cidade, classStatus, status);

    }
}

