package com.company.repositories;

import com.company.models.ClasseGramatical;
import com.company.models.Palavra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RepositorioPalavra {
    private ArrayList<ClasseGramatical> arrayCG;
    private RepositorioClasseGramatical repCG;
    public RepositorioPalavra(){
        this.arrayCG = new ArrayList<>();
        this.repCG = new RepositorioClasseGramatical();
    }

    public void salvar(Palavra palavra) throws IOException {
        //checa se a palavra ja pertence ao bd

        String arquivo = "palavrasIniciadasCom"+ palavra.getPalavra().charAt(0)+ ".txt";
        if(checarPrsenca(palavra, arquivo)){
            arquivo = "classesGramaticais"+palavra.getPalavra()+".txt";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String cg = bufferedReader.readLine();
            String ocorrencias = bufferedReader.readLine();
            while(cg != null){
                arrayCG.add(new ClasseGramatical(cg, Integer.parseInt(ocorrencias)));
                cg = bufferedReader.readLine();
                ocorrencias = bufferedReader.readLine();
            }
            //for(ClasseGramatical c : arrayCG){
           //     System.out.println(c.getClasseG() + " - " + c.getOcorrencias());
           // }
            atualizarOcorrencia(palavra, arquivo);
            repCG.salvar(arquivo, arrayCG);
        }else{

        }
    }

    public boolean checarPrsenca(Palavra palavra, String arquivo) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
        String line = bufferedReader.readLine();
        while(line != null){
            if(line.equals(palavra.getPalavra())){
                bufferedReader.close();
                return true;
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return false;
    }

    public void atualizarOcorrencia(Palavra palavra, String arquivo) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
        for(ClasseGramatical cg : arrayCG){
            if(cg.getClasseG().equals(palavra.getClasseG().getClasseG())){
               cg.setOcorrencias(cg.getOcorrencias()+1);
               break;
           }
       }
    }
}
