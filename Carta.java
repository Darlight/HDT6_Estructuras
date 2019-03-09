/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 8 de Marzo de 2019
Proposito: Clase de las cartas
 */
public class Carta{

    private String nombre;
    private String tipo;

    public Carta(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String toString() {
        return "Nombre de la carta: " + nombre + "/ Tipo: " + tipo;
    }
}