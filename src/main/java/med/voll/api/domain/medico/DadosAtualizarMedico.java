package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizarMedico(
        String nome,
        @NotNull
        Long id,
        String telefone,
        String email,
        DadosEndereco endereco) {
}
