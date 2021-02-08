//cadena de caracteres
// no usar nunca cin para guardar cadenas porque si hay espacios no te guarda por ejemplo un nombre y apellidos.
// std::gets() has been deprecated in C++11 and removed in C++14. The online compiler must use C++14 or later version of the language.
// Use fgets() because the gets() function is a common source of buffer overflow vulnerabilities and should never be used.

#include<iostream>
#include<string.h> //en vez de string
using namespace std;

int main(){

	char palabra[] = "alex";
 	char palabra2[] = {'a','l','e','x'};
	char nombre[30]; //numero de espacios, no hace ni caso realmente, coge espacio de memoria que no es suyo.

	cout<<palabra<<endl;
	cout<<palabra2<<endl;

	cout<<"digite su nombre ";
	//fgets(nombre,sizeof(nombre),stdin); //sizeof(str) is the size of a pointer, like 2, 4 or 8 bytes. Pass to fgets() the size of the memory pointed to by str
	//mejor asi
	cin.getline(nombre,20,'\n'); //terminaria con un salto de linea, esta forma si coge realmente los espacios que le marques.

	cout<<nombre<<endl;

	return 0;
}
