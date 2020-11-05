//Desarrollo un programa que lea de la entrada estandar un vector de enteros y determine cual es mayor.
//

#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
 	int enteros[100],n,mayor=0;

	cout<<"\nDigite el numero de elementos del vector: ";cin>>n;

	for(int i=0;i<n;i++){
	cout<<"\nDefina los elementos del vector en la posicion "<<i+1<<" ->  ";cin>>enteros[i];


	// 1 2 4 10 5, el primero que va a mirar es el 1, luego lo compara con mayor que era 1, si el 2 es mayor, cuando lo compare con el 10 este será el mayor.
	if(enteros[i]>mayor){
		mayor = enteros[i];
	}
	}

	cout<<"\nEl mayor elemento del vector es: "<<mayor<<endl;

	getchar();
	return 0;
}
