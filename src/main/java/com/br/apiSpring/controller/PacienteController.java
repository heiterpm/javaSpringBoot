package com.br.apiSpring.controller;

import com.br.apiSpring.paciente.DadosCadastroPaciente;
import com.br.apiSpring.paciente.Paciente;
import com.br.apiSpring.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
        System.out.println("dados recebido: " +dados);
    }
}
