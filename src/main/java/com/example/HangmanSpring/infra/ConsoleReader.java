package com.example.HangmanSpring.infra;

import com.example.HangmanSpring.service.GameService;
import com.example.HangmanSpring.service.ShowService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleReader {

    private GameService gameService;
    private ShowService showService;

    public ConsoleReader(GameService gameService, ShowService showService) {
        this.gameService = gameService;
        this.showService = showService;
    }

    @PostConstruct

    public void init(){
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        String entradaConsola;
        while(opcion!=0) {
            System.out.println("Juego del ahorcado");
            System.out.println("1.- Nuevo juego");
            System.out.println("0.- Salir");
            System.out.println("Ingrese la accion a realizar");
            entradaConsola = sc.next();
            try {
                opcion = Integer.parseInt(entradaConsola);
            }catch (Exception e) {
                System.out.println("Opcion no valida, ingresa un número");
            }
            switch (opcion) {
                case 0:
                    System.out.println("Hasta luego");
                    break;
                case 1:
                    //Empieza el juego
                    gameService.empiezaJuego();

                    break;




                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }
}
