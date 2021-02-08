//hacer un programa que pida al usuario que digite una cadena de caracteres, Verificar la longitud de la cadena y si supera los 10 caracteres mostrarla en pantalla y sino no.
//

#include<iostream>
#include<string.h>

using namespace std;

int main(){

	char palabra[30];
	cout<<"Introduzca una cadena de caracteres "<<endl;
	cin.getline(palabra,30,'\n');

	cout<<longitud<<endl;

	if(strlen(longitud) >= 10){
		cout<<"supera las 10 palabras"<<palabra<<endl;
	}else{
		cout<<"NO supera las 10 palabras"<<endl;
	}
	
	return 0;
}
