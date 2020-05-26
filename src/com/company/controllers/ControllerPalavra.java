package com.company.controllers;

import com.company.models.ClasseGramatical;
import com.company.models.Palavra;
import com.company.repositories.RepositorioPalavra;

import java.io.IOException;

public class ControllerPalavra {
    private RepositorioPalavra repPalavra;

    public ControllerPalavra(){
        this.repPalavra = new RepositorioPalavra();
    }

    public void salvar(Palavra palavra) throws IOException {
        repPalavra.salvar(palavra);
    }
}
