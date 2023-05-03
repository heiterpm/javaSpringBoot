package com.br.apiSpring.controller;

import com.br.apiSpring.medico.DadosCadastroMedico;
import com.br.apiSpring.medico.Medico;
import com.br.apiSpring.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
        System.out.println(dados);
    }
    @GetMapping
    public void lerTodos() {

    }
}
