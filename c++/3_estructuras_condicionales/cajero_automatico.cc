//hace un programa que simule un cajero automatico con un saldo inicial de 1000 euros

#include<iostream>

using namespace std;

int main(){
	int saldo_inicial = 1000,opc;
	float extra,saldo = 0,retiro;

	cout<<"\t bienvenido a su cajero virtual "<<endl;///t deja espacios en un linea
	cout<<"1.Ingresar dinero de la cuenta "<<endl;
	cout<<"2.Retirar dinero de la cuenta "<<endl;
	cout<<"3.salir "<<endl;
	cout<<"Opcion: "<<endl;cin>>opc; //opc es de opcion

	switch(opc){
		case 1:
			cout<<"Cuanto dinero va a ingresar: ";cin>>extra;
			saldo = saldo_inicial + extra;
			cout<<"Dinero en cuenta: "<<saldo;break;
		case 2:
			cout<<"Digite la cantidad a retirar: ";cin>>retiro;
			if (retiro > saldo_inicial){
				cout<<"NO tiene esa cantidad de dinero";
			}
			else {
				saldo = saldo_inicial -  retiro;
				cout<<"Dinero en cuenta: "<<endl<<saldo;
			}
		case 3: cout<<"\tGracias por su visita";break;
	}
return 0;
}
