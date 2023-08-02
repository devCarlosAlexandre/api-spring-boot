package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank(message = "nome é obrigatório")
        String nome,
        @NotBlank(message = "telefone é obrigatório")
        String telefone,
        @NotBlank(message = "email é obrigatório")
        @Email
        String email,
        @NotBlank(message = "crm é obrigatório")
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull(message = "especialidade é obrigatório")
        Especialidade especialidade,
        @NotNull(message = "Dados do endereço é obrigatório")
        @Valid
        DadosEndereco endereco
) {
}
