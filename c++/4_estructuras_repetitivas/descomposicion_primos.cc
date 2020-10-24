/* Realice un programa que calcule la descomposiion en factores primos de un numero entero.
 *
 * por ejemplo: 20 = 2*2*5.
 *
 * primero se prueba hasta que ya no se pueda dividir por 2, luego se divide por si mismo si ya no es par.
 *
 */

#include<iostream>

using namespace std;

int main(){

	int numero;

	cout<<"\nDigite un numero: ";cin>>numero;

	for(int i=2;numero>1;i++){
		while(numero%i==0){ //2 es donde inicia el contador
			cout<<i<<"\n";
			numero /= i;
		}
	}
return 0;	
}
