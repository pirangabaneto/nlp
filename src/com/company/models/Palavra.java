package com.company.models;

public class Palavra {
    private String palavra;
    private ClasseGramatical classeG;

    public Palavra(String palavra, String classeG){
        this.palavra = palavra;
        this.classeG = new ClasseGramatical(classeG);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public ClasseGramatical getClasseG() {
        return classeG;
    }

    public void setClasseG(ClasseGramatical classeG) {
        this.classeG = classeG;
    }
}
