// anadir o concatenar una cadena con otra -- funcion strcat()
//
#include<iostream>
#include<string.h>

using namespace std;

int main(){

	char cad1[] = "esto es una cadena";
	char cad2[] = " de ejemplo";
	char cad3[30]; //30 espacios

	strcpy(cad3,cad1); //cad3 = "esto es una cadena"

	strcat(cad3,cad2); // cad3 = "esto es una cadena de ejemplo" //te añade al final la cadena que tu le pongas

	cout<<cad3<<endl;

}

