package dev.java10x.TesteDeCadastros.Ninjas.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String Dificuldade;
    @OneToMany(mappedBy = "missoes") // Uma missao pode ter vários ninjas
    private List<NinjaModel> ninjas;



    public MissoesModel(Long id, String nome, String dificuldade) {
        this.id = id;
        this.nome = nome;
        Dificuldade = dificuldade;

    }

    public MissoesModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        Dificuldade = dificuldade;
    }
}
