package com.example.HangmanSpring.service;

import java.util.ArrayList;

public interface ShowServiceI {

    public void muestraPalabra(String palabra);
    public void muestraLetra(int index);

    public void muestraPalabraVacia(String palabra);
    public void muestraPalabraIndice(String palabra, ArrayList letras);

}
