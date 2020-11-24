/* hacer una matriz preguntando al usuario el numero de filas y columnas, llenar de numeros aleatorios, copiar el contenido a otra matriz y por ultimo mostrarla en pantalla*/


#include<iostream>
#include<stdlib.h>
#include<time.h>

using namespace std;

int main(){
	
	int numeros[100][100],nfilas,ncolumnas,dato;
	int numeros2[100][100];

	cout<<"Digite el numero de filas ";cin>>nfilas;
	cout<<"Digite el numero de columnas ";cin>>ncolumnas;

	srand(time(NULL));//generar numeros aleatorios

	//rellenando la matriz de numeros aleatorios
	for(int i=0;i<nfilas;i++){
		for(int j=0;j<ncolumnas;j++){
			dato = 1+rand()%(100); //generando numeros aleatorios entre 1-100;
			numeros[i][j] = dato;
		}
	}

       for(int i=0;i<nfilas;i++){
                for(int j=0;j<ncolumnas;j++){
                        numeros2[i][j] = numeros[i][j];
                }
        }
	//imprimiendo ultima matriz en pantalla
       for(int i=0;i<nfilas;i++){
                for(int j=0;j<ncolumnas;j++){
                        cout<<numeros2[i][j]<<" ";
                }
		cout<<"\n";
        }

	return 0;
}
