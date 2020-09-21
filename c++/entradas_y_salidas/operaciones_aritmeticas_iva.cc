/* escribir un programa que lea de entrada estandar un precio y muestre
 * el precio final con iva  */

#include <iostream>

using namespace std;

int main () {
	//Variables
	float precio,iva,precioFinal;
	cout<<"\nIntroduce el valor de compra\n";cin>>precio;

	iva = precio*0.21;
	precioFinal = precio+iva;

	cout<<"\nEl valor de compra con iva es:\n"<<precioFinal<<endl;
	return 0;
}
