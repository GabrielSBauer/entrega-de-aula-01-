package com.mycompany.aula01;

public interface MarioState {
    MarioState pegarCogumelo();
    MarioState pegarFlor();
    MarioState pegarPena();
    MarioState levarDano();
}
