//comprobar si un numero es positivio o negativo o si es 0.

#include<iostream>

using  namespace std;

int main(){
	int numero;
	cout<<"Digite un numero: ";cin>>numero;

	if(numero == 0) { //operador de igualdad
		cout<<"\nEl numero es cero "<<endl;
	}
	else if (numero>0){
		cout<<"\nEL numero es positivo"<<endl;
	}
	else {
		cout<<"\nEL numero es negativo"<<endl;
	}
	return 0;
}
