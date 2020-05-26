package com.company;

import com.company.controllers.ControllerClasseGramatical;
import com.company.controllers.ControllerPalavra;
import com.company.models.ClasseGramatical;
import com.company.models.Palavra;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//pode adicionar 1 palavra por vez
public class Main {

    public static void main(String[] args) throws IOException {
        //trabalhando CLASSEGRAMATICAL:
        ControllerClasseGramatical ccg = new ControllerClasseGramatical();
        ControllerPalavra cp = new ControllerPalavra();
        Palavra p = new Palavra("pandas", "substantivo");
       // System.out.println("palavrasIniciadasCom"+p.getPalavra().charAt(0));
        //System.out.println(p.getPalavra());
        cp.salvar(p);


        //Palavra pato = new Palavra("pato", "substantivo");
        //ccg.salvar(pato);
        //ClasseGramatical cg2 = new ClasseGramatical("artigo");

        //ccg.salvar(cg2);




        /**
        String frase = "a casa é branca";
        String[] fraseArray = frase.split(" ");
        System.out.println(Arrays.toString(fraseArray));
        for(String i : fraseArray){
            System.out.println(i);
        }
        **/
    }
}
