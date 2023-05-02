package com.br.apiSpring.paciente;

import com.br.apiSpring.endereco.DadosEndereco;
import com.br.apiSpring.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String email;
    String telefone;
    String cpf;
    @Embedded
    Endereco endereco;
}