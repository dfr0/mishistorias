//pediar al usuario una cadena de caracteres, almacenarla en un arreglo y copiar todo su contenido hacia otro arreglo de caracteres
#include<iostream>
#include<string.h>

using namespace std;

int main (){
	char name[20];
	char name2[20];

	cout<<"introduce tu nombre: ";cin.getline(name,20,'\n');
	strcpy(name2,name);
	
	cout<<"El nombre introducido es: "<<name2<<endl;

	return 0;
}
