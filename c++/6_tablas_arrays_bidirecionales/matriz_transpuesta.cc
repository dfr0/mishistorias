/*REalizar un programa que lea una matriz de 3x3 y cree su matriz transpuesta.
La matriz transpuesta es aquella en la que la columna i era la fila i de la matriz original
[1 2 3]  [1 4 7]
[4 5 6]  [2 5 8]
[7 8 9]  [3 6 9]
*/

#include<iostream>
#include<ncurses.h>

using namespace std;

int main (){
	int matriz[3][3];
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		cout<<" Digite el valor de las 3 filas y columnas ["<<i<<"]["<<j<<"] ";cin>>matriz[i][j];
		}
	}

	cout<<"\nMatriz Original\n";

        for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                cout<<matriz[i][j];
                }
		cout<<"\n";
        }

	cout<<"\nMatriz Transpuesta\n";

	for(int i=0;i<3;i++){
		for (int j=0;j<3;j++){
		cout<<matriz[j][i];
  		}
		cout<<"\n";
	}
return 0;

}
