package com.example.HangmanSpring.service;

import com.example.HangmanSpring.repository.WordsRepositoryMemory;
import org.springframework.stereotype.Service;

@Service
public class GameService implements GameServiceI{

    WordsRepositoryMemory wordsRepositoryMemory;
    public GameService(WordsRepositoryMemory wordsRepositoryMemory) {
        this.wordsRepositoryMemory = wordsRepositoryMemory;
    }

    private int intentos = 8;

    public int getIntentos() {
        return intentos;
    }

    @Override
    public boolean compruebaLetra(char c) {
        //TODO debe comprobar si la letra pertenece a la palabra
        return false;
    }

    @Override
    public boolean compruebaGanador() {
        //TODO comprueba si se ha terminado la partida cuando todas las letras están adivinidas
        return false;
    }

    @Override
    public boolean adivinaPalabraCompleta(String palabra) {
        //TODO comprueba si se ha puesto la palabra completa
        return false;
    }

    @Override
    public void empiezaJuego() {
        int contadorIntentos = 0;
        while(contadorIntentos < intentos) {

            intentos++;
        }
    }
}
