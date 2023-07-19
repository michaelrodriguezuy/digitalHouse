package com.example.democountries.model;

public class País {
    private String codigo;
    private String capital;

    private Continentes continente;

    public País(String codigo, String capital) {
        this.codigo = codigo;
        this.capital = capital;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Continentes getContinente() {
        return continente;
    }

    public void setContinente(Continentes continente) {
        this.continente = continente;
    }
}
