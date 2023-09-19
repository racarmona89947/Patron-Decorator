// Esta línea declara el paquete "Decorator" al que pertenece la clase.
package main; 
// Importa la clase Scanner del paquete java.util para la entrada de datos.
import java.util.Scanner;

import model.Burger;
import model.Cheese;
import model.Lettuce;
import model.Tomato; 

public class Main {
	// Método principal (main) del programa.
    public static void main(String... args) { 
    	// Crea una instancia de Scanner para la entrada de datos.
        Scanner sc = new Scanner(System.in); 
        // Crea una instancia de la clase base Hamburguesa.
        Burger burger = new Burger(); 
        
        System.out.println();
        System.out.println("**********************");
        System.out.println("Bienvenido a comidas rapidas el paisa");
        System.out.println("**********************");
        System.out.println();
        
        // Variable para almacenar la opción seleccionada por el usuario.
        int option = 0; 
        do {
            System.out.println("Seleccione el acompañante de su hamburguesa");
            System.out.println("1=lechuga, 2=Tomate, 3= Queso, 0=Terminar");
            // Lee la opción seleccionada por el usuario desde la entrada estándar.
            option = sc.nextInt(); 

            switch (option) {
                case 0:
                    break; // Termina el bucle si la opción es 0.
                case 1:
                	burger = new Lettuce(burger); // Agrega lechuga a la hamburguesa.
                    break;
                case 2:
                	burger = new Tomato(burger); // Agrega tomate a la hamburguesa.
                    break;
                case 3:
                	burger = new Cheese(burger); // Agrega queso a la hamburguesa.
                    break;
                default:
                    System.out.println("Opción no válida"); // Muestra un mensaje si la opción no es válida.
            }
        } while (option != 0); // Continúa el bucle hasta que la opción sea 0.

        System.out.println();
        System.out.println("Entregando.....");
        // Muestra la descripción final de la hamburguesa con todos los ingredientes agregados.
        System.out.println(burger.getDescription()); 
        System.out.println("¡Disfrute su pedido!!!");
    }
}



