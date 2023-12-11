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

public class maps {

    public static void main(String[] args) {


        final Map<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "david");
        hashMap.size();
        hashMap.isEmpty();
        hashMap.get(1);



        final Map<Integer, List> treeMap = new TreeMap<Integer, List>();

        final Map<Integer, List> linkedHashMap = new LinkedHashMap<Integer, List>();


    }

    /*
    El cuándo usar una implementación u otra de Map variará en función de la situación en la que nos encontremos.
    Generalmente, HashMap será la implementación que usemos en la mayoría de situaciones. HashMap es la implementación con mejor rendimiento
    (como se ha podido comprobar en el análisis de Set),
    pero en algunas ocasiones podemos decidir renunciar a este rendimiento a favor de cierta funcionalidad como la ordenación de sus elementos.
     */


}
