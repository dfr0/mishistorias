/* realiza un programa que defina una matriz de 3x3 y escriba un ciclo para que muestre la diagonal principal de la matriz 
123
456 
789

diagonal principal --> lugar en el que el numero de fila es igual al numero de columna en nuestro ejemplo seria 1,5 y 9
*/

#include<iostream>

using namespace std;

int main(){
	int numeros[3][3] = {{ 1,2,3 },{ 4,5,6 },{ 7,8,9 }};

	cout<<"Mostrando matriz completa ";
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		cout<<numeros[i][j];
		}
		cout<<"\n";
	}
	cout<<"Mostrar la diagonal de la matriz ";
	for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
			if(i==j){
				cout<<numeros[i][j]<<endl;
			}
                }
        }
	return 0;
}
