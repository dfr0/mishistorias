//crear una cadena que tenga la siguiente frase "hola que tal". luego crear otra cadena  para preguntarle al usuario su nombre
//por ultimo alañir el nombre al final de la primera cadena y mostrar el mensaje completo "hola que tal (nombre del usuario)
//

#include <iostream>
#include <string.h>

using namespace std;

int main(){

	char cabecera[]="el nombre de usuario es ";
	char titulo[50];
	char usuario[30];

	cout<<"Digite su nombre de usuario "<<endl;cin.getline(usuario,20,'\n');

	strcpy(titulo,cabecera);

	strcat(titulo,usuario);

	cout<<titulo<<endl;

}
