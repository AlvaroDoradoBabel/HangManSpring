package com.example.HangmanSpring.service;

import com.example.HangmanSpring.repository.WordsRepositoryMemory;
import org.springframework.stereotype.Service;

@Service
public class ShowService implements ShowServiceI{


    WordsRepositoryMemory wordsRepositoryMemory;
    public ShowService(WordsRepositoryMemory wordsRepositoryMemory) {
        this.wordsRepositoryMemory = wordsRepositoryMemory;
    }
    @Override
    public void muestraPalabra() {

    }

    @Override
    public void muestraLetra(int index) {

    }

    @Override
    public void muestraPalabraVacia(String palabra) {

    }
}
