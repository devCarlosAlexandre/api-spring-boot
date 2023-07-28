package med.voll.api.medico;

public record DadosListagemMedicos(String nome, String crm, String email, Especialidade especialidade, Long id) {
    public DadosListagemMedicos(Medico medico) {
        this(medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade(), medico.getId());
    }
}
