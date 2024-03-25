package br.com.fiap.bank.conta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ContaService {

    @Autowired
    ContaRepository repository;

    @SuppressWarnings("null")
    public Conta criar(@Valid Conta conta){
        return repository.save(conta);
    }

    public List<Conta> buscarTodas(){
        return repository.findAll();
    }
    
}
