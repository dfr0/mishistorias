/* Ralice un programa que lea un valor entero y determine si se trata de par o impart */


#include<iostream>

using namespace std;

int main(){
	int numero;
	cout<<"\nDigite un numero entero ";cin>>numero;

	
	if(numero==0){
		cout<<"\nEl numero es cero ";
		}
	else if(numero%2 == 0){ //divide el numero entre 2 y si el residuo es 0 es par, si es 1 seria impar
		cout<<"\nEl numero es par ";
	}
	else{
		cout<<"\nEL numero es impar ";
	}

	return 0;
}
