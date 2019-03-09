/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 8 de Marzo de 2019
Proposito: Clase de la coleccion
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Coleccion{
    private MapFactory mapa = new MapFactory();
    private Map<String,Carta> baraja;
    private Map<String,Carta> mano;

    public Coleccion(String mapa){
        this.baraja = mapa.getMap(mapa);
        this.mano = mapa.getMap(mapa);

    }

    public Map<String,Card> getBaraja() {
        return baraja;
    }

    public Map<String,Card> getMano() {
        return mano;
    }
    