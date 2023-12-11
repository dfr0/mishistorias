package arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

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
