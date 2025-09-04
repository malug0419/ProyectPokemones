package model;

public class Pokemon {

    private String nombre;
    private String tipo;
    private String habilidad;

    public Pokemon(String nombre, String tipo, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

}
