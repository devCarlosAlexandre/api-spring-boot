package med.voll.api.paciente;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPaciente(
        @NotBlank String nome,
        @NotBlank String email,
        @NotBlank String cpf) {

}
