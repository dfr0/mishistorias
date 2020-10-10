// escriba un programa que lea valores enteros hasta que se introduzca un valor en el rango 20-30 o se introductca el valor 0.
// el programa debe entregar la suma de los valores mayores a 0 introduccidos.
//

#include<iostream>


using namespace std;

int main(){
	int numero,suma;
	int i = 0; //inicializo contador
	
	do{
		cout<<"\nIntroduzca numeros enteros: ";cin>>numero;
		if (numero >= 0){
			suma += numero;
		}
	}while(numero <20 || numero >30);

	cout<<"Los numeros introduccidos mayores de 0 suman: "<<suma<<endl;
return 0;
}
