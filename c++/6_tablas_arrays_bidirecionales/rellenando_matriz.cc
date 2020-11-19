/* hacer un programa para rellenar una matriz pidiendo al usuario el numero de filas y columnas, Posteriormente mostrar la matriz en pantalla.*/

#include<iostream>
#include<ncurses.h>

using namespace std;

int main() {

	int numeros[100][100],filas,columnas;
	cout<<"Selecciona el numero de filas para la matriz ";cin>>filas;
	cout<<"Selecciona el numero de columnas para la matriz ";cin>>columnas;

	//Para las rellenar matrizes usamos bubles anidados
	for(int i=0;i<filas;i++){
		for (int j=0;j<columnas;j++){
			cout<<"Digite un numero ["<<i<<"]["<<j<<"] ";cin>>numeros[i][j];
		}
	}

	//Mostrando la matriz
	for(int i=0;i<filas;i++){
		for(int j=0;j<columnas;j++){
			cout<<numeros[i][j];
		}
		cout<<"\n";
	}
	getchar();
	return 0;
}
