// escriba un programa que lea dos numeros y determine el mayor.

#include<iostream>

using namespace std;

int main(){
    int n1,n2;

    cout<<"\nDigiteme dos numeros: ";
    cin>>n1>>n2; // asi podemos pedir dos entradas para las variables a la vez

    if(n1==n2){
	    cout<<"\nAmbos numeros son iguales"<<endl;
    }
    else if(n1>n2){ // este entra en juego si el primer if no coincide
        cout<<"\nEl mayor es: "<<n1<<endl;
    }
    else{
        cout<<"\nEl mayor es: "<<n2<<endl;
    }
	return 0;
}
