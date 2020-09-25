/*9 realice un programa que calcule el valor que toma la siguiente funcion para unos valores dados
 * de x e y
 * f(x,y) = raiz cuadrada de x / y elevado a la 2 - 1 */

#include<iostream>
#include<math.h>


using namespace std;


int main(){
	float x,y, resultado = 0;

	cout<<"Digite el valor de x: ";cin>>x;
	cout<<"Digite el valor de y: ";cin>>y;


	resultado = (sqrt(x))/(pow(y,2)-1);    // fijemonos que tiene dos partes, la de arriba de la fraccion y la de abajo

	cout<<"\nEl resultado es: "<<resultado<<endl;

	return 0;
}
