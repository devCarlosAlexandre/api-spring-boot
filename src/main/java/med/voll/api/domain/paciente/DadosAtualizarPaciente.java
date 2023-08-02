package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(String nome, String email, @NotNull(message = "{id.obrigatorio}") Long id) {
}
