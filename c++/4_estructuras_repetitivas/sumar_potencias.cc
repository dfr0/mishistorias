// escribir un programa que calcule el valor de 2^1 + 2^2 + 2^3 + ......2^n
//
#include<iostream>
#include<math.h> //libreria matematica

using namespace std;

int main(){
	int n,elevacion;
	cout<<"\nDigite el valor de N en 2^n ";cin>>n;

	for(int i=1;i<=n;i++){

	elevacion += pow(2,i); // i porque elevamos a cada elemento de la iteracion
	cout<<"\nEl resultado es de la suma de potencias de 2^n es: "<<elevacion<<endl;
	}
return 0;
}
