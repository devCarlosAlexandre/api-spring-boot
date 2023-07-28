package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(String nome, String email, @NotNull Long id) {
}
