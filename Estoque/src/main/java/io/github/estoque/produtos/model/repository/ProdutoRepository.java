package io.github.estoque.produtos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.estoque.produtos.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
