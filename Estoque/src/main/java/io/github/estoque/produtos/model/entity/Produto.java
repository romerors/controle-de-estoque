package io.github.estoque.produtos.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 13)
    @NotNull(message="{campo.codbarras.obrigatorio}")
    private String codbarras;

    @Column(nullable = false, length = 100)
    @NotEmpty(message="{campo.nome.obrigatorio}")
    private String nome;

    @Column(length = 150)
    private String descricao;

    @Column
    @NotNull(message="{campo.quantidade.obrigatorio}")
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;


}