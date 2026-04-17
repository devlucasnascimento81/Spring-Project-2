package dev.lucasnascimento.SpringProject2.Missoes;

import dev.lucasnascimento.SpringProject2.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String dificuldade;


    // @OneToMany uma missao para muitos ninjas
    @OneToMany(mappedBy = "")
    private List<NinjaModel> ninjas;

}
