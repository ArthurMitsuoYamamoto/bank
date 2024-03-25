package br.com.fiap.bank.conta;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Entity
@Data
public class Conta {

    @Id
    private Long numero;

    private String agencia; //0123


    @NotBlank(message = "Nome do titular é obrigatório")
    private String titular;

    @CPF(message = "CPF inválido")
    private String cpf;


    @PastOrPresent(message = "Data de abertura não pode ser no futuro")
    private LocalDate dataDeAbertura;
    
    @PositiveOrZero
    private BigDecimal saldo;
    

    private boolean ativa = true;

    @Pattern(regexp = "^(CORRENTE | POUPANÇA |SALARIO)$")
        
    
    private String tipo;
    
}
