package com.company.models;

import java.util.ArrayList;

//lembrar de tratar virgulas e outros pontos
//lembrar de pegar tudo minusculo pra nao haver repetições
public class Frase {
    private ArrayList<Palavra> arrayPalavra;
    private ArrayList<ClasseGramatical> arraycg;

    public Frase(String frase, ArrayList<String> cgString){
        this.arrayPalavra = new ArrayList<>();
        this.arraycg = new ArrayList<>();

        String[] fraseSplit = frase.split(" ");
        int contador = 0;
        for(String s: fraseSplit){
            arrayPalavra.add(new Palavra(s, cgString.get(contador)));
            //arraycg.add(new ClasseGramatical(cgString.get(contador)));
            contador++;
        }
    }

    public ArrayList<Palavra> getArrayPalavra() {
        return arrayPalavra;
    }

    public void setArrayPalavra(ArrayList<Palavra> arrayPalavra) {
        this.arrayPalavra = arrayPalavra;
    }

    public ArrayList<ClasseGramatical> getArraycg() {
        return arraycg;
    }

    public void setArraycg(ArrayList<ClasseGramatical> arraycg) {
        this.arraycg = arraycg;
    }
}
