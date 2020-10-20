// Calcular el factorial de un numero 1 * 2 * 3 ....*n, por ejemplo el de 5 seria 5! = 5 * 4 * 3 * 2 * 1


#include <iostream>
#include <curses.h>

using namespace std;

int main(){
	int i,n,factorial = 1; // en multiplicaciones itinerativas poner 1 en la variable que almacene el resultado.

	cout<<"\nDigite el valor de N: ";cin>>n;

	for(i=1;i<=n;i++){

	factorial = factorial * i;

	cout<<"\nEl resultado es el siguiente: "<<factorial<<endl;
	}
	getchar();
return 0;
}
