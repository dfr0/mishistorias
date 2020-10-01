//Mostrar los meses del año pidiendole al usuario un numero entre 1-12 y mostrar el que corresponde.
//

#include<iostream>


using namespace std;


int main(){
	int numero;

	cout<<"\nDigite un numero entre 1 y 12 ";


	switch(numero){
		case 1: cout<<"enero"<<endl;break;
		case 2: cout<<"febrero"<<endl;break;
		case 3: cout<<"marzo"<<endl;break;
		case 4: cout<<"abril"<<endl;break;
		case 5: cout<<"mayo"<<endl;break;
		case 6: cout<<"junio"<<endl;break;
		case 7: cout<<"julio"<<endl;break;
		case 8: cout<<"agosto"<<endl;break;
		case 9: cout<<"septiembre"<<endl;break;
		case 10: cout<<"octubre"<<endl;break;
		case 11: cout<<"noviembre"<<endl;break;
		case 12: cout<<"diciembre"<<endl;break;
	}

return 0;
}
