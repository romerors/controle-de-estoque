import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http'

import {TemplateModule} from './template/template.module';
import { HomeComponent } from './home/home.component'
import { ProdutosModule } from './produtos/produtos.module';
import {ProdutosService} from './produtos.service'

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TemplateModule,
    ProdutosModule
  ],
  providers: [
    ProdutosService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
