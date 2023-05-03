package com.br.apiSpring.controller;

import com.br.apiSpring.paciente.DadosCadastroPaciente;
import com.br.apiSpring.paciente.DadosListagemPaciente;
import com.br.apiSpring.paciente.Paciente;
import com.br.apiSpring.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }
    @GetMapping
    public List<DadosListagemPaciente> listar() {
        return repository.findAll().stream().map(DadosListagemPaciente::new).toList();
    }
}
