//EScriba un programa que calcule el valor de 1+2+3...+n
//
//


#include<iostream>


using namespace std;

int main(){
	int i,n,suma=0;

	cout<<"Cuanto vale n: ";cin>>n;

	for(i=1;i<=n;i++){ //Como ejemplo podemos poner i<=50, sino el true hasta el infinito
	suma += i;
	cout<<"Procesando numero: "<<i<<" Suma: "<<suma<<endl;
	}
return 0;
}
