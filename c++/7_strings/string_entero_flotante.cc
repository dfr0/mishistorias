// pedir al usuario 2 cadenas de caracteres de numeros, uno entero y el otro de tipo flotante y convertirlos a sus respectivos valores, y por ultimo sumarlos.
//

#include<iostream>
#include<string.h>
#include<stdlib.h>

using namespace std;

int main(){
    char cad1[20];
    char cad2[20];
    int x;
    float y, suma;

    cout<<"Digita un numero entero ";cin.getline(cad1,20,'\n');
    cout<<"Digita un numero con decimales ";cin.getline(cad2,20,'\n');

    x = atoi(cad1);
    y = atof(cad2);

    suma = x + y;

    cout<<"La suma de los dos numeros es "<<suma<<endl;

    return 0;
}