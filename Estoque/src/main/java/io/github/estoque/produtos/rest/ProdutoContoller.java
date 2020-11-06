package io.github.estoque.produtos.rest;

import io.github.estoque.produtos.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import io.github.estoque.produtos.model.entity.Produto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("http://localhost:4200")
public class ProdutoContoller {

    private final ProdutoRepository repository;

    @Autowired

    public ProdutoContoller(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> obterTodos(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto salvar(@RequestBody @Valid Produto produto){
      return repository.save(produto);
    }

    @GetMapping("{id}")
    public Produto acharPorId(@PathVariable Integer id ){
        return repository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(produto ->{
                    repository.delete(produto);
                    return Void.TYPE;
                })
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody @Valid Produto produtoAtualizado){
        repository
                .findById(id)
                .map(produto ->{
                   produtoAtualizado.setId(produto.getId());
                   return repository.save(produtoAtualizado);
                })
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado"));

    }

}
