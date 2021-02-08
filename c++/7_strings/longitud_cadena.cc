//longitud de una cadena de caracteres - function strLen()
//
#include<iostream>
#include<string.h>

using namespace std;

int main(){

	char palabra[] = "hola";
	int longitud=0; //es necesario declarar un variable entera

	longitud = strlen(palabra);

	cout<<"Numero de elementos de la cadena es "<<longitud<<endl;


	return 0;
}
