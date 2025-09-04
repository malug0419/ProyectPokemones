package model;

public class Controller {

    private Pokemon[] pokemones;

    public Controller(int nPokemones) {
        this.pokemones = new Pokemon[nPokemones];
    }

    // Metodo para agregar un pokemon
    public void addPokemon(int index, String nombre, String tipo, String habilidad) {
        if (index >= 0 && index < pokemones.length) {
            pokemones[index] = new Pokemon(nombre, tipo, habilidad);
        }
    }

    // Metodo para obtener un pokemon por indice
    public Pokemon getPokemon(int index) {
        if (index >= 0 && index < pokemones.length) {
            return pokemones[index];
        }
        return null;
    }

    // Metodo para obtener todos los pokemones
    public Pokemon[] getPokemones() {
        return pokemones;
    }

    // Metodo para obtener pokemones ordenados por tipo
    public Pokemon[] getPokemonesOrdenadosPorTipo() {
        Pokemon[] pokemonesOrdenados = new Pokemon[pokemones.length];
        
        // Copiar array original
        for (int i = 0; i < pokemones.length; i++) {
            pokemonesOrdenados[i] = pokemones[i];
        }

        // Ordenamiento burbuja por tipo
        for (int i = 0; i < pokemonesOrdenados.length - 1; i++) {
            for (int j = 0; j < pokemonesOrdenados.length - 1 - i; j++) {
                if (pokemonesOrdenados[j] != null && pokemonesOrdenados[j + 1] != null) {
                    if (pokemonesOrdenados[j].getTipo().compareToIgnoreCase(pokemonesOrdenados[j + 1].getTipo()) > 0) {
                        // Intercambiar pokemones
                        Pokemon temp = pokemonesOrdenados[j];
                        pokemonesOrdenados[j] = pokemonesOrdenados[j + 1];
                        pokemonesOrdenados[j + 1] = temp;
                    }
                }
            }
        }

        return pokemonesOrdenados;
    }

}