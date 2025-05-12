package dev.java10x.TesteDeCadastros.Ninjas.Model;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
//  JPA Java Persistency API;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private int idade;
    private String nome;
    private String email;

    @ManyToOne // Um ninja só pode ter uma missão
    @JoinColumn(name = "missoes_id") // Foreign key - chave estrangeiragit
    private MissoesModel missoes;

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NinjaModel() {
    }
    public NinjaModel(int idade, String nome, String email) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
    }
    public NinjaModel(Long id, int idade, String nome, String email, MissoesModel missoes) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.missoes = missoes;
    }
}
