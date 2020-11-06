package io.github.estoque.produtos;

import io.github.estoque.produtos.model.entity.Categoria;
import io.github.estoque.produtos.model.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CategoriasApplication {

    public static void main(String[] args) {
        SpringApplication.run(CategoriasApplication.class, args);

    }
}

