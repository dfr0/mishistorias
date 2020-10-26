//escribe un programa que defina un vector de numeros y calcule la multiplicacion acumulada de sus elementos.
//

#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
	int numeros[]={1,2,3,4,5},multiplicacion = 1; //multiplicacion se inicia en 1 porque si valiera 0 el resultado saldria como 0 y por 1 saldria correcto.

	for(int i=0;i<5;i++){

	multiplicacion *= numeros[i];

	}

	cout<<"\nLa multiplicacion de los elementos del array es: "<<multiplicacion<<endl;

	getchar();
	return 0;
}
