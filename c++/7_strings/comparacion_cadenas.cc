//Comparar cadenas - Funcion strcmp()
//
#include<iostream>
#include<string.h>

using namespace std;

int main (){
	char palabra1[] = "Hola";
	char palabra2[] = "hola";
	char palabra3[] = "becerro";
	char palabra4[] = "avion";

	if(strcmp(palabra1,palabra2)==0){
		cout<<"Ambas cadenas son iguales";
	}else{
		cout<<"Las cadenas son diferentes"<<endl;
	}


        if(strcmp(palabra4,palabra3) < 0){
                cout<<palabra3<<" esta despues alfabeticamente que "<<palabra4<<endl;
        }

  return 0;
}
