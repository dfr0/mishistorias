/* la sentencia for siempre que se cumpla ejecuta las instrucciones.
 *
  for (expr1; expresion logica; expr2){
  	conjunto de instrucciones;
	}
*/


#include<iostream>
#include<ncurses>


using namespace std;

int main(){
	int i; //i de iterador, podriamos poner cualquier cosa.

	for(i=10;i>=1;i--){ //podemos inicializar dentro del bucle.
		cout<<i<<endl;

	}
	getchar();
return 0;

}
