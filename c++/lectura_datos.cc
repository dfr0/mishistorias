/* lectura entrada de datos del usuario
	 Edad: tipo entero
 	 Sexo: tipo caracter
 	 Altura: dato de tipo real */

#include<iostream>

using namespace std;

int main () {
	int edad;
	char sexo;
	float altura;
	
	cout<<"\nIntroduce tu edad\n";cin>>edad;
	cout<<"\nIntroduce tu sexo\n";cin>>sexo;
	cout<<"\nIntroduce tu altura\n";cin>>altura;

        cout<<"\nTu edad es\n"<<edad;
        cout<<"\nTu sexo es\n"<<sexo;
        cout<<"\nTu altura es\n"<<altura<<endl;
	return 0;
}
