//copiar el contenido de una cadena a otra - function strcpy()
//
#include<iostream>
#include<string.h>


using namespace std;

int main(){

	char nombre[] = "david";
	char nombre2[20];

	strcpy(nombre2,nombre);   //primero va la cadena vacia y después la cadena con valores.

	cout<<nombre2<<endl;
	
	return 0;
}
