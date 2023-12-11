package arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


/*Dentro de la interfaz List existen varios tipos de implementaciones realizadas dentro de la plataforma Java. Vamos a analizar cada una de ellas:

ArrayList: esta es la implementación típica. Se basa en un array redimensionable que aumenta
su tamaño según crece la colección de elementos. Es la que mejor rendimiento tiene sobre la mayoría de situaciones.

LinkedList: esta implementación permite que mejore el rendimiento en ciertas ocasiones.
Esta implementación se basa en una lista doblemente enlazada de los elementos,
teniendo cada uno de los elementos un puntero al anterior y al siguiente elemento.

Ninguna de estas implementaciones son sincronizadas; es decir, no se garantiza el estado del List si dos o más hilos acceden de forma concurrente al mismo.
Esto se puede solucionar empleando una serie de métodos que actúan de wrapper para dotar a estas colecciones de esta falta de sincronización:

List list = Collections.synchronizedList(new ArrayList());
List list = Collections.synchronizedList(new LinkedList());
A continuación, vamos a ver cómo se crean los distintos tipos de interfaces:

final List arrayList = new ArrayList();
final List linkedList = new LinkedList();
        El cuándo usar una implementación u otra de List variará en función de la situación en la que nos encontremos. Generalmente, ArrayList será la implementación que usemos en la mayoría de situaciones. Sobretodo, varían los tiempos de inserción, búsqueda y eliminación de elementos, siendo en unos casos una solución más óptima que la otra.
*/


public class Listas {
    public static void main(String[] args) {

        //crear arrayList
        List<String> lista = new ArrayList<>();
        // creamos array de nombres
        String[] nombres = {"Marco", "Marisol", "Roberto"};
        //Mediante arrays creamos una nueva lista
        List<String> listaNombres = Arrays.asList(nombres);
        //añadimos elementos individuales
        List<String> listaAutos = new ArrayList<>();
        //agregamos un elemento a la lista
        listaAutos.add("Mercedes benz");
        //añadimos elementos de otra coleccion
        //Creamos una lista a la cual le pasamos una lista de coches
        List<String> elementos = new ArrayList<>(listaAutos);
        //Combinamos dos listas
        elementos.addAll(listaNombres);

        //Recorrer una lista
        for (String str : elementos) {
            System.out.println("Print with for " + str);
        }
        //Recorrer lista con ListIterator
        /*ListIterator es un objeto que se apropia de los elementos de una colección y tiene funcionalidades que permiten recorrer dicha colección o lista.
        La ventaja de recorrer con iteradores en vez de realizarlo con ciclos ,es que, los iteradores nos permiten realizar acciones cuando estemos recorriendo
        la lista.
        */

        //Creamos el iterador
        ListIterator<String> iterador = listaNombres.listIterator();

        //Mediante el ciclo while lo recorremos
        while (iterador.hasNext()){
            System.out.println("Print with Iterador " + iterador.next());
        }

        //Eliminar elementos de una lista

        //El parametro 0 representa el indice que queremos eliminar
        //listaNombres.remove(0);

        //eliminar elemento mediante el nombre
        //listaNombres.remove("Roberto");

        //eliminar todos los elementos de una lista
        //listaNombres.clear();
    }
}
