package arreglos;

/*
Gracias a la llegada de Java 8, las colecciones han aumentado su funcionalidad con la llegada de los streams.
Los streams permiten realizar operaciones funcionales sobre los elementos de las colecciones.

A continuación, mostramos un ejemplo de las bondades de los streams donde,
a partir de una lista de personas (donde cada una de ellas tiene un nombre), obtenemos una lista con todos los nombres:
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


    public static void main(String[] args) {

        List people = new ArrayList();
        //List names = people.stream().map(Person::getName).collect(Collectors.toList());
    }

}
