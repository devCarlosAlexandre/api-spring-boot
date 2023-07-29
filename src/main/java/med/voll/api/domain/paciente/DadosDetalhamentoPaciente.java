package med.voll.api.domain.paciente;

public record DadosDetalhamentoPaciente(String nome, String email, String cpf, Long id) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getId());
    }
}
