package com.company.repositories;

import com.company.models.Frase;
import com.company.models.Palavra;

import java.io.IOException;

public class RepositorioFrase {
    private RepositorioPalavra repPalavra;
    public RepositorioFrase(){
        this.repPalavra = new RepositorioPalavra();
    }
    public void salvar(Frase frase) throws IOException {
        for(Palavra palavra : frase.getArrayPalavra()){
            repPalavra.salvar(palavra);
        }
    }
}
