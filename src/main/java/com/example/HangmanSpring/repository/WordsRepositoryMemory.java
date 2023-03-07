package com.example.HangmanSpring.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Repository
public class WordsRepositoryMemory implements WordsRespositoryMemoryI{
    ArrayList<String> palabras = new ArrayList<String>(
            Arrays.asList("HOLA",
                    "CASA",
                    "PALABRA",
                    "PROGRAMACION",
                    "AHORCADO",
                    "JUEGO",
                    "BOTELLA",
                    "CARGADOR",
                    "AMIGO"));
    @Override
    public String eligePalabra() {
        Random randomNum = new Random();
        int indicePalabra = randomNum.nextInt(palabras.size());
        return palabras.get(indicePalabra);

    }
}
