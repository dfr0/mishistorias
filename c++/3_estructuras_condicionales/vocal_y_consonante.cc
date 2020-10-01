//Escriba un programa que lea la entrada estandar un caracter e indique en la salida standar si es una vocal miniscula o no_wq
//
//
#include<iostream>

using namespace std;

int main(){
	char letra;
	cout<<"\n Digite un letra: ";cin>>letra;

	switch(letra){
		case 'a': //importante que sean comillas simples porque son strings
		case 'e':
		case 'i':
		case 'o':
		case 'u': cout<<"Es una vocal minuscula";break; //Esta frase al ponerla aqui la usaran todas las anteriores
	        default: cout<<"NO es una vocal minuscula";break;
	}
}
