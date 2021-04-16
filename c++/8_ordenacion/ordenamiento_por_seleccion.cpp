//Odernamiento por seleccion
//Algoritmo de ordenamiento que requiere O(n^2)
//1. buscar el minimo ordenamiento de la lista
//2. intercambiarcon el primer elemento
//3. buscar el minimo del resto de la lista
//4. Intercambiar con el segundo
//5. y asi sucesivamente
//
#include<iostream>

using namespace std;

int main(){
	int numeros[] = {3,2,1,5,4};
	int i,j,aux,min;
	//algoritmo por ordenamiento por seleccion
	for(i=0;i<5;i++){
		min = i; //tomamos la primera posicion como si fuera la menor aunque no lo sea, es para empezar a buscar
		for(j=i+1;j<5;j++){ //j es la posicion que se irá moviendo
			if(numeros[j] < numeros[min]){
				min = j; //si encuentra el menos lo pone en j
			}
		}
        aux = numeros[i];       //aux es para hacer el intercambio
        numeros[i] = numeros[min];
        numeros[min] = aux;
	}
	//Mostrar seleccion
        cout<<"Orden ascendente: ";
        for(i=0;i<5;i++){
        cout<<numeros[i]<<" ";
	}
}
