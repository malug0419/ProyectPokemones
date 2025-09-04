package ui;

import java.util.Scanner;
import model.Controller;
import model.Pokemon;

public class Main {

    private Controller controller;
    private Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        String in;
        System.out.print("Ingrese la cantidad de pokemones: ");
        in = scanner.nextLine();
        int nPokemones = Integer.parseInt(in);

        // Inicializar el controller
        controller = new Controller(nPokemones);

        // Agregar pokemones
        for (int i = 0; i < nPokemones; i++) {
            System.out.print("Ingrese el nombre del pokemon " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese el tipo del pokemon " + (i + 1) + ": ");
            String tipo = scanner.nextLine();
            
            System.out.print("Ingrese la habilidad del pokemon " + (i + 1) + ": ");
            String habilidad = scanner.nextLine();
            
            controller.addPokemon(i, nombre, tipo, habilidad);
        }

        // Mostrar pokemones ordenados por tipo
        System.out.println("\nPokemones organizados");
        Pokemon[] pokemonesOrdenados = controller.getPokemonesOrdenadosPorTipo();
        for (int i = 0; i < pokemonesOrdenados.length; i++) {
            if (pokemonesOrdenados[i] != null) {
                System.out.println("Pokemon: " + pokemonesOrdenados[i].getNombre() + 
                                 ", Tipo: " + pokemonesOrdenados[i].getTipo() + 
                                 ", Habilidad: " + pokemonesOrdenados[i].getHabilidad());
            }
        }

        scanner.close();
    }

}