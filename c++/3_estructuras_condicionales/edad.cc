// EScriba un programa que solicite la edad y te diga si está en el rango de 18-25.
//

#include<iostream>


using namespace std;

int main(){
	int edad;
	cout<<"\nDigite su edad: ";cin>>edad;

	if((edad>=18)&&(edad<=25)){ //se debe cumplicar las dos partes && es el Y logico.
		cout<<"\nSu edad está en el rango de 18 a 25"<<endl;
	}
	else {
		cout<<"\nSu edad no está en el rango de 18 a 25"<<endl;
	}
	return 0;
}
