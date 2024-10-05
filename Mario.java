package com.mycompany.aula01;

public class Mario {
    protected MarioState estado; // Estado atual de Mario

    // Construtor inicializando Mario como grande
    public Mario() { 
        estado = new MarioGrande(); 
    }

    // Mario pega um cogumelo
    public void pegarCogumelo() {
        estado = estado.pegarCogumelo();
    }

    // Mario pega uma flor
    public void pegarFlor() {
        estado = estado.pegarFlor();
    }

    // Mario pega uma pena
    public void pegarPena() {
        estado = estado.pegarPena();
    }

    // Mario leva dano
    public void levarDano() {
        estado = estado.levarDano();
    }
}
