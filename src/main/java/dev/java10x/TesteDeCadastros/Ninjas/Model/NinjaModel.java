package dev.java10x.TesteDeCadastros.Ninjas.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Cria construtor vazio
@AllArgsConstructor // Criar construtores com argumentos
@Data // Criar getters e setters

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
}

