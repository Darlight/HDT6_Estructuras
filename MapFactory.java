/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 8 de Marzo de 2019
Proposito: Factory que instancia el tipo de Mapa a utilizar
 */
import java.util.*;
public class MapFactory<K,V>{
    public Map<K,V> getMap(String map){
        if (map == null){
            return null;
        }
        else if(map.equals("HashMap")){
            return new HashMap<K,V>();
        }
        else if(map.equals("TreeMap")){
            return new TreeMap<K,V>();
        }
        else if(map.equals("LinkedHashMap")){
            return new LinkedHashMap<K,V>();
        }
        return	null;
    }
}