package com.example.HangmanSpring.service;

import com.example.HangmanSpring.repository.WordsRepositoryMemory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ShowService implements ShowServiceI{

    @Override
    public void muestraPalabra(String palabra) {
        System.out.println(palabra);
    }

    @Override
    public void muestraLetra(int index) {

    }

    @Override
    public void muestraPalabraVacia(String palabra) {
        int longitud = palabra.length();
        for(int i = 0;i< longitud; i++) {
            System.out.print("_ ");
        }
        System.out.println();
    }

    @Override
    public void muestraPalabraIndice(String palabra, ArrayList letras) {
        char arrayPalabra[] = palabra.toCharArray();
        for(int i = 0;i<arrayPalabra.length;i++) {
            if(letras.contains(arrayPalabra[i])) {
                System.out.print(arrayPalabra[i]);
            }else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
}
