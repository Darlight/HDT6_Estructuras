/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 8 de Marzo de 2019
Proposito: Factory que instancia el tipo de Mapa a utilizar
 */
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFactory{
    public Map<String,String> getMap(String map){
        if (map == null){
            return null;
        }
        else if(map.equals("HashMap")){
            return new HashMap<String,String>();
        }
        else if(map.equals("TreeMap")){
            return new TreeMap<String,String>();
        }
        else if(map.equals("LinkedHashMap")){
            return new LinkedHashMap<String,String>();
        }
        return	null;
    }
}