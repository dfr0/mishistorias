/* escriba un programa que lea de la entrada estandar los dos catetos de una triangulo rectangulo
 * y escriba en la salida estandar su hipotenusa. */


#include<iostream>
#include<math.h> //libreria matematica

using namespace std;

int main (){
	
	float cateto1, cateto2, hipotenusa = 0;

	cout<<"\nCalculo de Hipotenusa"<<endl;
	cout<<"\nIntroduzca el valor del primer cateto: ";cin>>cateto1;
	cout<<"\nIntroduzca el valor del segundo cateto: ";cin>>cateto2;

	hipotenusa = sqrt(pow(cateto1,2)+pow(cateto2,2)); //sqrt para raiz cuadrada y pow para elevar un numero

	cout.precision(2);

	cout<<"\nEl valor de la hipotenusa es: "<<hipotenusa<<endl;
	return 0;
}
