package dev.java10x.TesteDeCadastros.Ninjas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String Dificuldade;
    @OneToMany(mappedBy = "missoes") // Uma missao pode ter vários ninjas
    private List<NinjaModel> ninjas;
}


