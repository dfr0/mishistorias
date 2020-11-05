/*Realiza un programa que defina dos vectores de caracteres y despues almacene el contenido de ambos vectores en un nuevo vector, situando en primer lugar los elementos del primer
 * vector seguido por los elementos del segundo vector. Muestre el contenido del nuevo vector en la salida standar*/


#include<iostream>
#include<ncurses.h>

using namespace std;

int main(){
	char letras1[] = {'a','e','i','o','u'};
	char letras2[] = {'d','r','t','y','k'};
	char letras3[10];


	//copiar los elementos del arreglo letras1 hacia letras 3
	
	for(int i=0;i<5;i++){
		letras3[i] = letras1[i];
	}

        for(int i=0;i<10;i++){
                letras3[i] = letras2[i-5];
        }

	for(int i=0;i<10;i++){
	cout<<letras3<<endl;
	}

	getchar();
	return 0;
}
