package com.company.repositories;

import com.company.models.ClasseGramatical;
import com.company.models.Palavra;

import java.io.*;
import java.util.ArrayList;

public class RepositorioClasseGramatical {
    public void salvar(Palavra palavra) throws IOException {
        //importa todas as classes gramaticais e as repassa para a palavra
        BufferedReader bufferedReader = new BufferedReader(new FileReader("classesGramaticais.txt"));
        String line = bufferedReader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("classesGramaticais"+palavra.getPalavra()+".txt", true));

        while(line != null){
            writer.write(line + "\n");
            writer.write("0" + "\n");
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        writer.close();
    }

    public void salvar(String arquivo, ArrayList<ClasseGramatical> arrayCG) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
        for(ClasseGramatical cg : arrayCG){
            writer.write(cg.getClasseG() + "\n");
            writer.write(cg.getOcorrencias() + "\n");
        }
        writer.close();
    }
}
