//Hacer un programa que calcule el resultado de la siguiente expresion 1-2+3-4+5-6..n
//
//
//par = -2-4-6
//impar = 1+3+5
//luego suma total sumaTotal = pares + impares
//
#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
	int n, par, sumaImpares = 0,sumaPares = 0,sumaTotal = 0;

	cout<<"\nDigite el valor de N: ";cin>>n;

	for(int i=1;i<=n;i++){
		if(i%2==0){
			par = i * -1;// lo multiplicamos por -1 para hacerlo negativo
			sumaPares += par;
		}
		else {
			sumaImpares += i;
	}
		sumaTotal = sumaPares + sumaImpares;
		cout<<"\nEl resultado de la suma es: "<<sumaTotal<<endl;
	}
	getchar();
return 0;
}
