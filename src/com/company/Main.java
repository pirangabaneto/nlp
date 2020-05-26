package com.company;

import com.company.controllers.ControllerClasseGramatical;
import com.company.controllers.ControllerFrase;
import com.company.controllers.ControllerPalavra;
import com.company.models.ClasseGramatical;
import com.company.models.Frase;
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
        ControllerFrase cf = new ControllerFrase();
        //Palavra p = new Palavra("pandas", "substantivo");
       // System.out.println("palavrasIniciadasCom"+p.getPalavra().charAt(0));
        //System.out.println(p.getPalavra());
        //cp.salvar(p);

        String p = "A casa é branca";
        //System.out.println(Arrays.toString(p.split(" ")));
        ArrayList<String> arraycg = new ArrayList<>();
        arraycg.add("artigo");
        arraycg.add("substantivo");
        arraycg.add("pronome");

        Frase f = new Frase("a casa dele",arraycg);
        cf.salvar(f);
        //System.out.println(arraycg.get(3));
        //System.out.println("a casa é branca".split(" ".toString()));
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
