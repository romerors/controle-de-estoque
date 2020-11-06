import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { ProdutosService } from '../../produtos.service';
import { Produto } from '../produto';

@Component({
  selector: 'app-produtos-lista',
  templateUrl: './produtos-lista.component.html',
  styleUrls: ['./produtos-lista.component.css']
})
export class ProdutosListaComponent implements OnInit {

  produtos: Produto[]=[];
  produtoSelecionado: Produto;
  mensagemSucesso: String;
  mensagemErro: String;

  constructor(
  private service:ProdutosService,
  private router:Router) {}

  ngOnInit(): void {
    this
    .service
    .getProdutos()
    .subscribe( resposta=> this.produtos = resposta);
  }

  novoCadastro(){
    this.router.navigate(['/produtos-form']);
  }

  preparaDelecao(produto:Produto){
    this.produtoSelecionado = produto;
  }

  deletarProduto(){
    this.service
    .deletar(this.produtoSelecionado)
    .subscribe( 
      response => {
    this.mensagemSucesso = 'Produto deletado com sucesso'!,
    this.ngOnInit();
    },
    erro => this.mensagemErro = 'Ocorreu um erro ao deletar o produto.'
    )

  }

}
