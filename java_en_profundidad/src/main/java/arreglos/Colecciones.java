package arreglos;

import java.util.*;

/*
Una colección representa un grupo de objetos. Esto objetos son conocidos como elementos. Cuando queremos trabajar con un conjunto de elementos,
necesitamos un almacén donde poder guardarlos. En Java, se emplea la interfaz genérica Collection para este propósito. Gracias a esta interfaz,
 podemos almacenar cualquier tipo de objeto y podemos usar una serie de métodos comunes, como pueden ser: añadir, eliminar, obtener el tamaño de la colección…
 Partiendo de la interfaz genérica Collection extienden otra serie de interfaces genéricas.
 Estas subinterfaces aportan distintas funcionalidades sobre la interfaz anterior.
 */
public class Colecciones {

    public static void main(String[] args) {
    /*Set
La interfaz Set define una colección que no puede contener elementos duplicados.
Esta interfaz contiene, únicamente, los métodos heredados de Collection añadiendo la restricción de que los elementos duplicados están prohibidos.
Es importante destacar que, para comprobar si los elementos son elementos duplicados o no lo son,
es necesario que dichos elementos tengan implementada, de forma correcta, los métodos equals y hashCode.
Para comprobar si dos Set son iguales, se comprobarán si todos los elementos que los componen son iguales sin importar en el orden que ocupen dichos elementos.

Dentro de la interfaz Set existen varios tipos de implementaciones realizadas dentro de la plataforma Java. Vamos a analizar cada una de ellas:

HashSet: este implementación almacena los elementos en una tabla hash. Es la implementación con mejor rendimiento de todas pero no garantiza ningún orden a la hora de realizar iteraciones. Es la implementación más empleada debido a su rendimiento y a que, generalmente, no nos importa el orden que ocupen los elementos. Esta implementación proporciona tiempos constantes en las operaciones básicas siempre y cuando la función hash disperse de forma correcta los elementos dentro de la tabla hash. Es importante definir el tamaño inicial de la tabla ya que este tamaño marcará el rendimiento de esta implementación.
TreeSet: esta implementación almacena los elementos ordenándolos en función de sus valores. Es bastante más lento que HashSet. Los elementos almacenados deben implementar la interfaz Comparable. Esta implementación garantiza, siempre, un rendimiento de log(N) en las operaciones básicas, debido a la estructura de árbol empleada para almacenar los elementos.
LinkedHashSet: esta implementación almacena los elementos en función del orden de inserción. Es, simplemente, un poco más costosa que HashSet.
Ninguna de estas implementaciones son sincronizadas; es decir, no se garantiza el estado del Set si dos o más hilos acceden de forma concurrente al mismo. Esto se puede solucionar empleando una serie de métodos que actúan de wrapper para dotar a estas colecciones de esta falta de sincronización:
     */
        //Set set = Collections.synchronizedSet(new HashSet());
        //SortedSet sortedSet = Collections.synchronizedSortedSet(new TreeSet());
        //Set set = Collections.synchronizedSet(new LinkedHashSet());

        //hashSet example

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        //TreeSet example

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet " + (endTreeSetTime - startTreeSetTime));

        //HashSet example
        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }
}