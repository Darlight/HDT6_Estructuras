/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 8 de Marzo de 2019
Proposito: Clase de la coleccion
 */
import java.util.*;

public class Coleccion {
    private MapFactory creador_mapa = new MapFactory();
    private Map<String,Carta> baraja;
    private Map<String,Carta> mano;

    public Coleccion(String mapa) {
        // Constructor
        this.baraja = creador_mapa.getMap(mapa);
        this.mano = creador_mapa.getMap(mapa);
    }

    public Map<String,Carta> getBaraja() {
        return baraja;
    }

    public Map<String,Carta> getMano() {
        return mano;
    }
}
