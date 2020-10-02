/*Hacer un menu con 3 opciones
 
  caso 1: cubo de un numero
  caso 2: numero par o impar
  caso 3: salir del programa

*/

#include<iostream>
#include<math.h>

using namespace std;

int main(){
	int numero,cubo,opc;

	cout<<"\tBienvenido al menu principal";
	cout<<"\nDigite un numero: ";cin>>numero;


	cout<<"1.Cubo de un numero "<<endl;
	cout<<"2.Numero par o impar "<<endl;
	cout<<"3.Salir "<<endl;cin>>opc;

	switch(opc){
	case 1:
		cubo=(pow(numero,2));
		cout<<"El cubo del numero introduccido es: "<<cubo<<endl;break;
	case 2: 
		if(numero%2 == 0){ //Si es divisible por 2 y el resto es 0 es par, si el resto es 1 es impar
			cout<<"El numero introduccido es par"<<endl;break;
		}
		else {

		  	cout<<"El numero introduccido es impar"<<endl;break;
		}
	case 3: 
		cout<<"\tHasta luego";break;

	}
return 0;
}
