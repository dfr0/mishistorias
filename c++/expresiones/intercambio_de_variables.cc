/* Escriba un fragmento de programa que intercambie los valores de dos variables
 * x = 5 y y = 10, al finalizar el programa tienen que acabar asi x = 10 y y= 5 */

#include<iostream>

using namespace std;

int main() {
	int x, y, aux;

	cout<<"Digite el valor de x: "; cin>>x;
	cout<<"Digite el valor de y: "; cin>>y;

	aux = x;
	x = y;
	y = aux;


	cout<<"\n el nuevo valor de x es: "<<x<<endl;
	cout<<"\n el nuevo valor de y es: "<<y<<endl;


return 0 ;
}
