package com.example.HangmanSpring.service;

public interface GameServiceI {
    public boolean compruebaLetra(char c);
    public boolean compruebaGanador();

    public boolean adivinaPalabraCompleta(String palabra);

    public void empiezaJuego();

}
