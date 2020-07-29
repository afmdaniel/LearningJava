package com.daniel.enumtest;

public enum Book {
    // declara constantes do tipo enum
    MAT("Matematica", "2015"),
    FIS("Fisica", "2013"),
    PORT("Portugues", "2012"),
    GEO("Geografia", "2014"),
    FILO("Filosofia", "2016"),
    HIST("Historia", "2019");
    
    // campos de instâcia
    private final String title; // titulo de livro
    private final String copyrightYear; // ano dos direitos autorais
    // todos inicializam com 1, *Sem static, cada um tem o seu
    // *com static, mudando um, muda todos
    private static int numero = 1;
    
    // construtor enum
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    // GETTERS
    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }




}
