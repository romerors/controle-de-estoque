package io.github.estoque.produtos.rest;

import io.github.estoque.produtos.model.entity.Categoria;
import io.github.estoque.produtos.model.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    @Autowired

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria salvar(@RequestBody @Valid Categoria categoria){
        return repository.save(categoria);
    }

}