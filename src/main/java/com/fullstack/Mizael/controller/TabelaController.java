package com.fullstack.Mizael.controller;

import com.fullstack.Mizael.model.Tabela;
import com.fullstack.Mizael.repository.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin
@RequestMapping(path="/inicio")
public class TabelaController {
    @Autowired
    private TabelaRepository tabela;

    @PostMapping(path="/adicionar")
    public @ResponseBody String adicionarNome(@RequestParam String name ,
    @RequestParam String cpf /*,
    @RequestParam String dataNascimento,
    @RequestParam Double salario,
    @RequestParam String email,
    @RequestParam String endereco*/
    ) {
        Tabela u = new Tabela();
        u.setNome(name);
        u.setCpf(cpf);
/*        u.setDataNascimento(dataNascimento);
        u.setSalario(salario);
        u.setEmail(email);
        u.setEndereco(endereco);*/
        tabela.save(u);
        return "Salvo";
    }

    @GetMapping(path="/tudo")
    public @ResponseBody Iterable<Tabela> getTodosUsuarios() {
        return tabela.findAll();
    }


}
