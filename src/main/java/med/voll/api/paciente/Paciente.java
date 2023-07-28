package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    private Boolean ativo;

    public Paciente(DadosCadastroPaciente dados) {
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.email = dados.email();
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizarPaciente dados) {
        if (dados.email() != null) {
            this.email = dados.email();
        }
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
