package io.github.estoque.produtos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.estoque.produtos.model.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
