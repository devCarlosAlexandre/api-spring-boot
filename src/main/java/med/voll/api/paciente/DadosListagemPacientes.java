package med.voll.api.paciente;

public record DadosListagemPacientes(String nome, String email, Long id) {
    public DadosListagemPacientes(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getId());
    }

}
