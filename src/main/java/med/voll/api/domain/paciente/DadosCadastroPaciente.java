package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPaciente(
        @NotBlank(message = "{nome.obrigatorio}") String nome,
        @NotBlank(message = "{email.obrigatorio}") String email,
        @NotBlank(message = "{cpf.obrigatorio}") String cpf) {

}
