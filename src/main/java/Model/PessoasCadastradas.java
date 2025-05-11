package Model;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_pessoas")
public class PessoasCadastradas {
//  JPA Java Persistency API;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int idade;
    String nome;
    String email;
    String ocupacao;

    public PessoasCadastradas() {
    }
    public PessoasCadastradas(int idade, String nome, String email, String ocupacao) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.ocupacao = ocupacao;
    }
}
