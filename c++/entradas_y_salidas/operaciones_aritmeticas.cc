/* 1- escribe un programa que lea de la entrada estandar dos numeros y muestre en la salida estandar su 
 * suma, resta, multiplicacion y division
 *
 *	stream	description
	cin	standard input stream
	cout	standard output stream
	cerr	standard error (output) stream
	clog	standard logging (output) stream
 *
 *
 * */

#include <iostream>

using namespace std;

int main () { 
  int n1,n2,suma = 0, resta = 0, multiplicacion = 0, division = 0; //inicializamos variables con valor 0 y añadimos muchas variables separandolas con ,
  cout<<"Digite un numero: "; cin>>n1; // En C++ las expresiones se separan con ; asi que podemos hacerlo en la misma linea
  cout<<"Digite otro numero: "; cin>>n2; // En C++ las expresiones se separan con ; asi que podemos hacerlo en la misma linea

  suma = n1 + n2;
  resta = n1 - n2;
  multiplicacion = n1 * n2;
  division = n1  / n2;

  cout<<"\nLa suma es "<<suma<<endl;
  cout<<"\nLa resta es "<<resta<<endl;
  cout<<"\nLa multiplicacion es "<<multiplicacion<<endl;
  cout<<"\nLa division es: "<<division<<endl;
  cout<<"\nLa division es: "<<division<<endl;

return 0;
}
