// escribe un programa que defina un vector de numero y calcule la suma de sus elementos.
//
//
#include<iostream>
#include<ncurses.h>

using namespace std; //entrada y salida de datos


int main(){
	int numeros[]={1,2,3,4,5};
	int suma = 0;

	for (int i=0;i<5;i++){ //los vectores siempre inician en 0.
	suma = suma + numeros[i]; 

	}

	cout<<"\nLa suma de los elementos de mi vector "<<suma<<endl;

	getchar();
	return 0;
}
