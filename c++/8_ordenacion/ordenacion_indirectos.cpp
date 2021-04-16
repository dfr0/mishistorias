/*Debe el nombre a su inventor donal l shell. Se suele denominar tambien ordenacion por insercion con incrementos decrecientes. 
 En el argoritmo de insercion, cada elemento se compara con los elementos contiguos de su izquierda, uno tras otro. Si el elemento a insertar es el mas pequeño hay que realizar 
 muchas comparaciones antes de colocarlo en su lugar definitivo. 
 El argoritmo de shell modifica los saltos contiguos por saltor de mayor tamaño lo que reduce su tiempo. Generalmente se tomar como salto inicial n/2 (n numero de elementos) luego en cada
 iteracion se reduce el salto a la mitad, hasta que el salto es de tamaño 1.
 pasos a seguir:
 1. se divide la lista original en n/2 grupos de dos, considerance un incremento o salto entre los elementos de n/2.
 2. se clasifica cada elemento por separado, comparando las parejas de elementos y si no están ordenados se intercambian.
 3. se divide ahora la lista en la mitad de grupos (n/4) cpn un salto entre los elementos tambien n/4 y nuevamente se clasifica cada grupo por separado. 
 4. asi sucesivamente, se sigue dividiendo la lista en la mitad de grupos que en el recorrido anterior con un salto decreciente en la mitad que el salto anterior, y luego clasificando cada grupo
 por separado.
 5. el algoritmo termina cuando el tamaño del salto es 1

 lista ejemplo:
 6 1 5 2 3 4 0
 0 1 2 3 4 5 6 INDICE

salto = 7, entre 2 es 3 redondeado. Variable de tipo entera.

aqui primero comparariamos esto:

si (a[j] <= a[k]) ENtonces --> A es el arreglo y a[j] = posicion 0 osea 6 y a[k] en este caso es la posicion a la que saltamos que es el 2
  arreglo ordenado
  SINO
  intercambio

Cuando todos los saltos den un SI entonces dividimos el salto entre 2.

*/

#include<iostream>

using namespace std;

int main(){


}



