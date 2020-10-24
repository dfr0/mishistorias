/*realice un programa que solicite al usuario que piense un numero entero entre el 1 y el 100.
 * El programa debe generar un numero aleatorio en ese mismo rango[1-100] e indicarle al usuario si el numero que digito es menor o mayor
 * al numero aleatorio, asi hasta que lo adivine. y por ultimo mostrarle el numero de intentos que llevo.
 *
 * variable = limite_inferior + rand() % (Limite_superior +1 - Limite_inferior
 * */

#include<iostream>
#include<time.h> //para general el aleatorio

using namespace std;

int main(){
	int entero,aleatorio = 0,fallos = 0;


	srand(time(NULL));
	aleatorio = 1 + rand()%(100); 

	//cout<<"El numero aleatorio generado es "<<aleatorio<<endl;

	do{
	  cout<<"\nDigite un numero entero entre 1 y 100: ";cin>>entero;
          if(entero<aleatorio){
            cout<<"\nDigite un numero mayor "<<endl;
	    fallos++;
            }
          if(entero>aleatorio){
            cout<<"\nDigite un numero menor "<<endl;
	    fallos++;
            }
	}while(entero!=aleatorio);
        cout<<"\nAcertaste!!!solamente fallaste: "<<fallos<<" veces "<<endl;
return 0;
}
