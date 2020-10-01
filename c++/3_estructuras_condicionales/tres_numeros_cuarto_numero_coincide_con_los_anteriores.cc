/* escribe un programa que lea de la entrada estandar 3 numeros. Despues de leer un cuarto numero e indicar si el numero
 coincide con algo de los introduccidos con anterioridad. */

#include<iostream>

using namespace std;

int main(){
	int n1,n2,n3,n4;

	cout<<"\nDigita 3 numeros: ";cin>>n1>>n2>>n3;
	cout<<"\nDigita un cuarto numero para ver si coincide con los anteriores: ";cin>>n4;


	if((n4==n3)||(n4==n2)||(n4==n1)){ // para comparar un O se usan los ||
		cout<<"\nEl cuarto numero es igual a alguno de los anteriores"<<endl;
	}
	else {
		cout<<"\nEL cuarto numero No coincide con ninguno de los anteriores"<<endl;
	}
return 0;
}
