package dev.java10x.TesteDeCadastros.Ninjas.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")

    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";


    }

}
// teste commit
