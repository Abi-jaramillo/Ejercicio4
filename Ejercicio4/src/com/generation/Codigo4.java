package com.generation;

import java.util.Scanner;

public class Codigo4 {
	
public static void main(String[] args) { //se creo el metodo main para que pueda correr 
Scanner s = new Scanner(System.in); //se importo scanner desde java.util y se agregó el system.in para instanciarlo
    
//turno del jugador 1
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
//se corrigio para que fuera el turno del jugador 2
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in); //se agrego la instancia
    String j2 = s.nextLine();
    
    //para ver si hay un empate
    if (j1.equals(j2)) { //se usa equals para la comparacion
      System.out.println("Empate");
    } else {
      int g = 2; //nos dice el ganador por default es el jugador 2
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { //se usa equals para la comparacion
            g = 1; //nos dice que el jugador 1 gana
          }//if
          break; //se agrega el break para interrumpir el switch de este caso

        case "papel":
          if (j2.equals("piedra")) {//se usa equals para la comparacion
            g = 1;
            }//if
          break;//se agrega el break para interrumpir el switch de este caso
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }//if
          break;
          
        default:
      }//switch
      System.out.println("Gana el jugador " + g); //nos dice que jugador gano
    }//else
	
	
}//class main

}//class codigo4
