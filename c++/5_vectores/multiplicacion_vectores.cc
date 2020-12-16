/* hacer un programa que lea 5 numeros en la entrada estandar y cree un arreglo, los copie a otro arreglo multiplicados por 2 y muestre el segundo arreglo*/

#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
	int numeros[5],numeros2[5];

	for(int i=0;i<5;i++){

		cout<<i+1<<". Digite la posicion del vector siguiente: ";cin>>numeros[i];
	}
	for(int i=0;i<5;i++){
		numeros2[i] = numeros[i]*2;
	}
	
	for(int i=0;i<5;i++){
	  cout<<"\nEl vector resultante de la multiplicacion del primer vector es: "<<numeros2[i]<<endl;
	}
  getchar();
  return 0;
}
