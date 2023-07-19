package com.example.democountries.model;

public enum Continentes {
    AFRICA(1), OCEANÍA(2);

    private int codigo;

    Continentes(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }
}
