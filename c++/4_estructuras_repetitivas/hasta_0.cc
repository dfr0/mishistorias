/* realice un programa que lea de la entrada standar numeros hasta que se introduzca 0. EN ese momento el programa debe terminar y mostrar en la salida estandar
 * el numero de valores mayores que cero leidos*/


#include<iostream>
#include<curses.h>

using namespace std;

int main(){
	int numero,conteo=0;

	do{
	  cout<<"\n Introduzca numeros, cuando quiera finalizar meta el 0 ";cin>>numero;
	if(numero>0){
	  conteo++;
	  }
	}while(numero != 0); //mientras sea diferente a 0 continua.
	cout<<"\nEl numero de valores introducidos mayores a cero es: "<<conteo<<endl;

return 0;
}
