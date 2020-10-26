//Escribe un programa que defina un vector de numeros y calcule si existe algún numero en el vector cuyo valor equivale a la suma del resto de numeros del vector.
//
#include<iostream>
#include<ncurses.h>


using namespace std;

int main(){
	int numeros[5] = {1,2,3,4,10},suma = 0,mayor;

	for(int i = 0;i<5;i++){

	  suma += numeros[i];

	  if(numeros[i] > mayor){
	    mayor = numeros[i]; //Si lo es cambia el valor de mayor al elemento mayor
	    }
	}

	if(mayor == suma-mayor){
		cout<<"\nEl numero "<<mayor<<" equivale a la suma del resto de elementos";

	}else{

	 cout<<"\nNo existe ningun numero igual a la suma de los demas"; 

	cout<<"\nPrueba suma numeros "<<suma<<endl;

	}
  getchar();
return 0;
}
