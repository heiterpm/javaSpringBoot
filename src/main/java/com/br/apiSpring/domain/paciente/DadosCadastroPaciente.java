package com.br.apiSpring.domain.paciente;

import com.br.apiSpring.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @Pattern(regexp = "\\d{11,12}")
        String telefone,
        @NotBlank
        String cpf,
        @NotNull
        @Valid
        DadosEndereco endereco
) {
}
