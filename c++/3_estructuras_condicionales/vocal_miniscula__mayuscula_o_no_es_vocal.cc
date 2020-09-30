//escribe un programa que lea de la entrada estandar un caracter e indique en la salida estandar
//si el caracter es una vocal minuscula, es una vocal mayúscula o no es una vocal.
//


#include<iostream>

using namespace std;

int main(){
	char letra;
	cout<<"\nIndique una letra: ";cin>>letra;

	switch(letra){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u': cout<<"\nEl caracter es una vocal minuscula"<<endl;break;
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U': cout<<"\nEl caracter es una vocal mayuscula"<<endl;break;
		default: cout<<"\n es caracter no es una vocal"<<endl;break;
	}
}
