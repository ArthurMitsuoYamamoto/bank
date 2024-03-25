package br.com.fiap.bank.conta;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
@RequestMapping("conta")


public class ContaController {

    ContaService service;

    public ContaController(ContaService service){
        this.service = service;
    }
    
    
        @PostMapping
        @ResponseStatus(CREATED)
        public Conta create(@RequestBody @Valid Conta conta){
            return service.criar(conta);

    }

    @GetMapping
    public List<Conta> index(){
        return service.buscarTodas();
    }
}