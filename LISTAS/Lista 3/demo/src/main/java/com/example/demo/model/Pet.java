package com.example.demo.model;

public class Pet {
    private int id;
    private String nome;
    private String especie;
    private boolean jaFoiAdotado;

    public Pet() {
    }

    public Pet(int id, String nome, String especie, boolean jaFoiAdotado) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.jaFoiAdotado = jaFoiAdotado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean getjaFoiAdotado() {
        return jaFoiAdotado;
    }

    public void setjaFoiAdotado(boolean jaFoiAdotado) {
        this.jaFoiAdotado = jaFoiAdotado;
    }

}
