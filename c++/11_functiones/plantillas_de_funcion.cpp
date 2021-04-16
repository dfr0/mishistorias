// ejemplo sacar el valor absoluto de un numero.
// recordamos que un numero absoluto es el mismo numero pero siempre en positivo.
// No dice el tipo de numero que es, no dice si es entero o flotante o doble, para esto nos va a servir la plantilla de funcion. Para hacer un tipo de dato general.
//
#include<iostream>
using namespace std;
//prototipo de funcion
template <class TIPOD>
void mostrarAbs(TIPOD numero); //podemos mandar cualquie tipo de tipo de numero //prefijo de la plantilla

int main(){
	int num1 = -4;
	float num2 = -56.67;
	double num3 = -123.5678;

	mostrarAbs(num1);
	mostrarAbs(num2);
	mostrarAbs(num3);
	

return 0;
}


template <class TIPOD> //lo que hay debajo puede ser de cualquier tipo
void mostrarAbs(TIPOD numero){ //void no retorna nada
	if(numero<0){
		numero = numero * -1;
	}
	cout<<"El valor absoluto del numero es: "<<numero<<endl;
}
