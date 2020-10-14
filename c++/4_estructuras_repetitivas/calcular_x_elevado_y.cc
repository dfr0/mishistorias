//Escriba un programa que calcule x^y, donde tanto x como y son enteros positivos, sin usar la funcion pow.


#include<iostream>

using namespace std;

int main(){
	int x,y,elevacion=1;

	cout<<"\nPonga el valor de x ";cin>>x;
	cout<<"\nPonga el valor de y ";cin>>y;

	//2^3 se tendria que multiplicar 3 veces por si mismo
	
	for(int i=1;i<=y;i++){
	  elevacion = elevacion * x;
	}

	cout<<"\nEl Resultado de la elevacion es "<<elevacion;
return 0;
}
