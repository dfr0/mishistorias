/* la calificacion final de un estudiante es la media ponderada de tres notas:
 * la nota de practia que cuenta como un 30% del total
 * la nota teorica que cuenta con un 60% 
 * la nota de participacion que cuenta con el 10%.
 * Escriba un programa que lea de la entrada estandar las tres notas de un alumno y escriba en la salida estandar su nota final */

#include<iostream>

using namespace std;

int main (){
	float practica, teorica, participacion, nota_final = 0;

	cout<<"Digite la nota de practica: ";cin>>practica;
	cout<<"Digite la nota de teorica: ";cin>>teorica;
	cout<<"Digite la nota de participacion: ";cin>>participacion;

	
	practica *= 0.30; // es lo mismo que practica = practica * 0.30
	teorica *= 0.60; // 0.6 es lo mismo
	participacion *= 0.10;

	nota_final = practica + teorica + participacion;


	cout<<"\nLa nota final es: "<<nota_final<<endl;

return 0;
}
