package com.generation;
import java.util.Scanner; //importe el Scanner

public class Codigo4 {
    public static void main(String [] args) { //cree el metodo main y meti dentro el codigo del ejercicio.

        Scanner s = new Scanner(System.in); //agregue el System.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner s2 = new Scanner(System.in); //faltaba el System.in
        String j2 = s2.nextLine(); //corregi el s. por el s2.

        if (j1.equals(j2)) { //camvie el == por .equals ya que este funciona con Strings.
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { //cambie == por .equeals
                        g = 1;
                    }
                    break; //faltaba un break para detener el bucle en caso de que se cumpliera esta condicion

                case "papel":
                    if (j2.equals("piedra")) { //cambie == por .equals
                        g = 1;
                    } //faltaba una llave de cierre para este case
                    break; //faltaba un break para esta condicion

                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                    default:
                    }
                    System.out.println("Gana el jugador " + g);
            }


        }

    }
