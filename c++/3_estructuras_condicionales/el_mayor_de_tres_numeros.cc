// escriba un programa que lea dos numeros y determine el mayor.

#include<iostream>

using namespace std;

int main(){
    int n1,n2,n3;

    cout<<"\nDigiteme tres numeros: ";
    cin>>n1>>n2>>n3; // asi podemos pedir dos entradas para las variables a la vez

    if ((n1 >= n2) && (n1 >= 3))
	    cout<<"\nEl mayor es: "<<n1<<endl;
    else if ((n2 >= n1) && (n2 >= 3))
	    cout<<"\nEl mayor es: "<<n2<<endl;
    else {
	   cout<<"\nEL mayor es: "<<n3<<endl;
    }
	return 0;
}
