package arreglos;

import java.util.*;

/*
La interfaz Map asocia claves a valores. Esta interfaz no puede contener claves duplicadas y; cada una de dichas claves,
sólo puede tener asociado un valor como máximo.

Dentro de la interfaz Map existen varios tipos de implementaciones realizadas dentro de la plataforma Java. Vamos a analizar cada una de ellas:

HashMap: este implementación almacena las claves en una tabla hash. Es la implementación con mejor rendimiento de todas pero no garantiza ningún orden
a la hora de realizar iteraciones. Esta implementación proporciona tiempos constantes en las operaciones básicas siempre y cuando
la función hash disperse de forma correcta los elementos dentro de la tabla hash. Es importante definir el tamaño inicial de la tabla ya que este tamaño marcará
el rendimiento de esta implementación.

TreeMap: esta implementación almacena las claves ordenándolas en función de sus valores
Es bastante más lento que HashMap. Las claves almacenadas deben implementar la interfaz Comparable.
Esta implementación garantiza, siempre, un rendimiento de log(N) en las operaciones básicas, debido a la estructura de árbol empleada para almacenar los elementos.

LinkedHashMap: esta implementación almacena las claves en función del orden de inserción. Es, simplemente, un poco más costosa que HashMap.
Ninguna de estas implementaciones son sincronizadas; es decir, no se garantiza el estado del Map si dos o más hilos acceden de forma concurrente al mismo.
Esto se puede solucionar empleando una serie de métodos que actúan de wrapper para dotar a estas colecciones de esta falta de sincronización:

Map map = Collections.synchronizedMap(new HashMap());
SortedMap mortedMap = Collections.synchronizedSortedMap(new TreeMap());
Map map = Collections.synchronizedMap(new LinkedHashMap());
 */


/*
// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
Map<Integer, String> nombreMap = new HashMap<Integer, String>();
nombreMap.size(); // Devuelve el numero de elementos del Map
nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
nombreMap.put(K clave, V valor); // Añade un elemento al Map
nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
nombreMap.clear(); // Borra todos los componentes del Map
nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
nombreMap.values(); // Devuelve una "Collection" con los valores del Map
 */

public class maps {

    public static void main(String[] args) {


        final Map<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "david");
        hashMap.put(3, "Raul");
        hashMap.put(5, "ruben");
        hashMap.put(6, "mongolo");
        hashMap.put(7, "donpuente");
        hashMap.put(2, "perico");

        hashMap.size();
        hashMap.isEmpty();
        hashMap.get(1);

        System.out.println("hashMap LIST");

        // Imprimimos el Map con un Iterador
        Iterator it = hashMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor " + hashMap.get(key));
        }


        final Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1, "david");
        treeMap.put(3, "Raul");
        treeMap.put(5, "ruben");
        treeMap.put(6, "mongolo");
        treeMap.put(7, "donpuente");
        treeMap.put(2, "perico");

        System.out.println("treeMap LIST");

        Iterator iti = treeMap.keySet().iterator();
        while (iti.hasNext()){
            Integer key = (Integer) iti.next();
            System.out.println("Clave: " + key + "-> Valor " + treeMap.get(key));
        }

        final Map<String, List> linkedHashMap = new LinkedHashMap<String, List>();

        linkedHashMap.put("nombres", Arrays.asList("perico","Palotes","miscojones"));
        linkedHashMap.put("coches", Arrays.asList("toyota","seat","ford"));
        linkedHashMap.put("apellidos", Arrays.asList("gomez","ramirez","fernandez"));

        System.out.println("linkedHashMap LIST");

        Iterator itir = linkedHashMap.keySet().iterator();
        while (itir.hasNext()){
            String key = (String) itir.next();
            System.out.println("Clave: " + key + "-> Valor " + linkedHashMap.get(key));
        }
    }

    /*
    El cuándo usar una implementación u otra de Map variará en función de la situación en la que nos encontremos.
    Generalmente, HashMap será la implementación que usemos en la mayoría de situaciones. HashMap es la implementación con mejor rendimiento
    (como se ha podido comprobar en el análisis de Set),
    pero en algunas ocasiones podemos decidir renunciar a este rendimiento a favor de cierta funcionalidad como la ordenación de sus elementos.
     */


}
