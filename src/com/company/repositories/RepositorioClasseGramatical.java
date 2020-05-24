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

        //BufferedWriter writer = new BufferedWriter(new FileWriter("classesGramaticais"+"txt", true));
        //for(int i = 0; i < 10; i++){ //10 eh o numero de classes gramaticais
         //   writer.write("");
        //}
        //writer.write(cg.getClasseG() + "\n");
        //writer.write(cg.getOcorrencias() + "\n");
    }
}
