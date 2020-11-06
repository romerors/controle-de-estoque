package io.github.estoque.produtos;

import io.github.estoque.produtos.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.github.estoque.produtos.model.entity.Categoria;

@SpringBootApplication
public class ProdutosApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProdutosApplication.class, args);

    }
}
