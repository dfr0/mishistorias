/* Escriba un programa que lea las tres notas de un alumno y calcule la nota final media de dicho alumno.*/

#include<iostream>

using namespace std;

int main (){

	float nota1,nota2,nota3,promedio;

	cout<<"Digite la primera nota: ";cin>>nota1;	
	cout<<"Digite la segunda nota: ";cin>>nota2;	
	cout<<"Digite la tercera nota: ";cin>>nota3;	

	promedio = (nota1+nota2+nota3)/3;

	cout.precision(2);

	cout<<"El promedio de las tres notas es: "<<promedio<<endl;


	return 0;
}
