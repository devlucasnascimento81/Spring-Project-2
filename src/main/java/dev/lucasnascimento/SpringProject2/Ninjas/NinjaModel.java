package dev.lucasnascimento.SpringProject2.Ninjas;

import dev.lucasnascimento.SpringProject2.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne um ninja tem uma unica misssao
    @ManyToOne
    @JoinColumn(name = "missoes-id") // foreing key oou chave estrangeira
    private MissoesModel missoes;
}
// Entity ele transforma uma classe em uma entidade  do banco de dados
