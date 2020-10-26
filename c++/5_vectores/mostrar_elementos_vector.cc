// escribe el programa que lea de la entrada estandar un vector de numeros y muestre en la salida estandar los numeros del vector con sus indices asociados.
//

#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
	int numeros[100],n;

	cout<<"\nDigite el numero de elementos del arreglo: ";cin>>n;

	for(int i=0;i<n;i++){

		cout<<"Digite un numero: ";cin>>numeros[i]; //Guardando todos los elementos del vector

	}

	//Ahora, vamos a mostrar los elementos con sus indices asociados
	
	for(int i=0;i<n;i++){

		cout<<i<<" -> "<<numeros[i]<<endl;

	}

	getchar();
	return 0;
}
