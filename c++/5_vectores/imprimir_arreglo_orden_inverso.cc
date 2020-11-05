//escribe un programa que define un vector de numeros y muestre en la salida estandar el vector en orden inverso - del ultimo al primer elemento.
//
//
#include<iostream>
#include<ncurses.h>

using namespace std;


int main(){
	int numeros[5] = {1,2,3,4,5};

	for(int i = 4;i>=0;i--){
	cout<<numeros[i]<<endl;
	}
	getchar();
	return 0;
}
