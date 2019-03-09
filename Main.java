/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 8 de Marzo de 2019
Proposito: Programa principal donde se hacen las barajas
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor, escoja que tipo de mapa va a utilizar \n");
        String map = scan.nextLine();
        //Implementacion de mapa entre HashMap,TreeMap y LinkedHashMap.
        Coleccion pila_cartas = new Coleccion(map);
        /*
        Por fallo de organizar de tiempo, no se cumplió ningún de los métodos de requisito
        de la practica. Aceptamos la nota que nos daran ustedes. No hay excusa mas que
        la falta de organizacion de tiempo.
         */


    }
}
