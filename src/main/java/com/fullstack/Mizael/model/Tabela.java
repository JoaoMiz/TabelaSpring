package com.fullstack.Mizael.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "tabela")
@Setter
@Getter
public class Tabela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String nome;
     private String cpf;
     private String dataNascimento;
     private Double salario;
     private String email;
     private String endereco;
    public Tabela(){
        //Construtor padrão
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = "";
        this.salario = 0.0;
        this.email = "";
        this.endereco = "";
    }
}
