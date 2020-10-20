// EScriba un programa que calcule el valor de 1! + 2! + 3! +...n! suma de factoriales
//
#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
	int nElementos,suma = 0,factorial = 1;
	cout<<"\nDigite el numero de elementos a sumar: ";cin>>nElementos;

	for(int i=1;i<=nElementos;i++){

		factorial *= i;
		suma += factorial;
	}
	cout<<"\nLa suma de factoriales es "<<suma<<endl;
	getchar();
return 0;
}
