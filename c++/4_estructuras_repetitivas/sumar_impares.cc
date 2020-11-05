//Suma de los n numeros impares, 1+3+5---+2n-1, la formula es n que es el numero final +1 partido por 2 elevado al cuadrado.
//
#include<iostream>
#include<math.h>
#include<curses.h>

using namespace std;

int main(){
	int nElementos,sumaTotal=0;

	cout<<"\nDigite el numero de elementos a sumar: ";cin>>nElementos;

	for(int i=1;i<=2*nElementos-1;i+=2){ //la suma comienza en 1 siempre. 1+=2 suma de dos en dos, osea los impares.
		sumaTotal += i; // sumaTotal = sumaTotal + i

	cout<<"\nEl resultado de la suma es: "<<sumaTotal<<endl;

	}
	getchar();
	return 0;
}
