package com.company.models;

public class ClasseGramatical {
    private String classeG;
    private int ocorrencias;

    public ClasseGramatical(String classeG){
        this.classeG = classeG;
        this.ocorrencias = 0;
    }

    public String getClasseG() {
        return classeG;
    }

    public void setClasseG(String classeG) {
        this.classeG = classeG;
    }

    public int getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
}
