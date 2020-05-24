package com.company;

import com.company.controllers.ControllerClasseGramatical;
import com.company.models.ClasseGramatical;
import com.company.models.Palavra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//pode adicionar 1 palavra por vez
public class Main {

    public static void main(String[] args) throws IOException {
        //trabalhando CLASSEGRAMATICAL:
        ControllerClasseGramatical ccg = new ControllerClasseGramatical();
        Palavra pato = new Palavra("pato", "substantivo");
        ccg.salvar(pato);
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
