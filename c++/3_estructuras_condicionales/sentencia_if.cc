/* la sentencia if
 

   if(condicion){
   	intrucciones 1;
	}
   else{
        instrucciones 2;
   }

  */


#include<iostream>

using namespace std;


int main(){
	int numero, dato = 5;

	cout<<"Digite un numero: ";
	cin>>numero;

	if(numero == dato){ //== es el operador de igualdad no de operacion, el operador contrario es !=
		cout<<"El numero es 5";
	}
	else {
		cout<<"El numero es diferente de 5";
	}

	return 0;
}
