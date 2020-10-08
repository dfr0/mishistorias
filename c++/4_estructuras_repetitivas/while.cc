/* La sentencias while:

   while (expresion logica){
   	conjunto de instrucciones;
	}
*/

// yo need compile with option -ldcurses
#include<iostream>
#include<ncurses.h> //es similar a conio.h. Is a C header file used in old MS-DOS compilers to create text user interfaces. Compilers that targeted non-DOS operating systems, such as Linux, Win32 and OS/2, provided different implementations of these functions.

using namespace std;

int main(){
	int i; // un iterador, es un contador. Con 1 mostrará los numeros a partir del 1.
	
	i = 1; // si queremos que vaya al contrario podriamos inicializarlo en 10

	while(i <= 100){ // para lo contrario podemos ponerlo en 1
		cout<<i<<endl;
	i++ ;// i = i + 1 // podriamos poner -- para hacer el bucle contrario.
}
  getchar(); // the same that getch
  return 0;
}
