/*10. Escriba un programa que calcule las soluciones de una ecuación de segundo grado de la forma ax^2 + bx + c =0, teniendo en cuenta que:
 * (-b+sqrt(pow(b,2)-4*a*c))/(2*a) y (-b-sqrt(pow(b,2)-4*a*c))/(2*a)   */


#include<iostream>
#include<math.h>
using namespace std;

int main(){
	float a,b,c, resultado1 = 0, resultado2=0; // sabemos seguro que necesitamos 3 variables y 2 resultados diferentes por el contexto.


	cout<<"Digite el valor de a: ";cin>>a;
	cout<<"Digite el valor de b: ";cin>>b;
	cout<<"Digite el valor de c: ";cin>>c;


	resultado1 = (-b+(sqrt(pow(b,2)-(4*a*c))))/(2*a);
	resultado2 = (-b-(sqrt(pow(b,2)-(4*a*c))))/(2*a);


	cout<<"\nEl resultado1 es: "<<resultado1<<endl;
	cout<<"\nEl resultado2 es: "<<resultado2<<endl;

}
