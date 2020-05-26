package com.company.controllers;

import com.company.models.Frase;
import com.company.repositories.RepositorioFrase;

import java.io.IOException;

public class ControllerFrase {
    RepositorioFrase repFrase;
    public ControllerFrase(){
        this.repFrase = new RepositorioFrase();
    }

    public void salvar(Frase frase) throws IOException {
        repFrase.salvar(frase);
    }
}
