package com.example.HangmanSpring.service;

import com.example.HangmanSpring.repository.WordsRepositoryMemory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

@Service
public class GameService implements GameServiceI{

    WordsRepositoryMemory wordsRepositoryMemory;
    ShowService showService;
    String palabraElegida;
    ArrayList<Character> letrasAdivinadas = new ArrayList<Character>();




    public GameService(WordsRepositoryMemory wordsRepositoryMemory, ShowService showService) {
        this.wordsRepositoryMemory = wordsRepositoryMemory;
        this.showService = showService;
        this.palabraElegida = wordsRepositoryMemory.eligePalabra();
    }

    private int intentos = 8;

    public int getIntentos() {
        return intentos;
    }

    @Override
    public boolean compruebaLetra(char c) {
        boolean encontrado = false;

        for(int i =0;i<palabraElegida.length();i++) {
            if(palabraElegida.charAt(i) == c) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    @Override
    public boolean compruebaGanador() {

        return palabraElegida.chars().distinct().count() == letrasAdivinadas.size();
    }

    @Override
    public boolean adivinaPalabraCompleta(String palabra) {
        System.out.println("Estoy comparando: " + palabra + " y " + palabraElegida);
        System.out.println(palabra.equals(palabraElegida));
        return palabra.equals(palabraElegida);
    }

    @Override
    public void empiezaJuego() {
        Scanner sc = new Scanner(System.in);
        boolean hayGanador = false;
        String entrada;
        int contadorIntentos = 0;
        while(contadorIntentos < intentos && !hayGanador) {
                showService.muestraPalabraIndice(palabraElegida,letrasAdivinadas);
                System.out.println("Intentos restantes: " + (intentos-contadorIntentos));
                entrada = sc.next();
                entrada.toUpperCase();
            System.out.println("He recogido: " + entrada.charAt(0));
            if(entrada.length() == 1) {
                    if(compruebaLetra(entrada.charAt(0))) {
                        letrasAdivinadas.add(entrada.charAt(0));
                        hayGanador = compruebaGanador();
                    }else {
                        contadorIntentos++;
                    }
                }else {
                    if(adivinaPalabraCompleta(entrada)) {
                        hayGanador = true;
                    }else {
                        contadorIntentos++;
                    }
                }


        }
        System.out.println("¡¡¡HAS GANADO, LA PALABRA ERA: " + palabraElegida);
        letrasAdivinadas.removeAll(letrasAdivinadas);
        this.palabraElegida = wordsRepositoryMemory.eligePalabra();

    }
}
