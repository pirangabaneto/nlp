package com.company.controllers;

import com.company.models.ClasseGramatical;
import com.company.models.Palavra;
import com.company.repositories.RepositorioClasseGramatical;

import java.io.IOException;

public class ControllerClasseGramatical {
    private RepositorioClasseGramatical repCG;

    public ControllerClasseGramatical(){
        this.repCG = new RepositorioClasseGramatical();
    }
    public void salvar(Palavra palavra) throws IOException {
        repCG.salvar(palavra);
    }
}
