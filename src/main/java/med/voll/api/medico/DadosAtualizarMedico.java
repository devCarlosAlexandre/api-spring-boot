package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizarMedico(
        String nome,
        @NotNull
        Long id,
        String telefone,
        String email,
        DadosEndereco endereco) {
}
