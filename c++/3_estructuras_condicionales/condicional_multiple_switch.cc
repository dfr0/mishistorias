/* sentencia switch

   switch(expresion){
     case Literal1:
       conjunto de instrucciones 1;
       break; //para que no salte a las siguientes y se queda aqui
     case Literal1:
       conjunto de instrucciones n;
       break; //para que no salte a las siguientes y se queda aqui
     default: 
       conjunto de instrucciones si ninguna se cumple;
       break;
      }
*/

#include<iostream>

using namespace std;

int main(){
	int numero;

	cout<<"\nDigite un numero entre 1 y 5: ";cin>>numero;

	switch(numero){
		case 1: cout<<"\nEs el numero 1";break;
		case 2: cout<<"\nEs el numero 2";break;
		case 3: cout<<"\nEs el numero 3";break;
		case 4: cout<<"\nEs el numero 4";break;
		case 5: cout<<"\nEs el numero 5";break;
		default: cout<<"\nNo esta en el rango entre 1 y 5";break;
	}

	return 0;
}
