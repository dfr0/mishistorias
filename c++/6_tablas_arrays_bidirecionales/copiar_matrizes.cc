/* Hacer una matriz de tipo entera de 2* 2, llenarla de numeros y luego copiar todo el contenido hacia otra matriz */


#include<iostream>

using namespace std;

int main(){
	int numeros[2][2] = {{1,2},{3,4}},nuevamatriz[2][2];

	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			nuevamatriz[i][j] = numeros[i][j];
		}
	}
        for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                        cout<<nuevamatriz[i][j];
                }
		cout<<"\n";
        }
return 0;
}
