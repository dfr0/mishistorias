//transformar una cadena a numeros - Function atoi() y atof()
//"123" a 123 para numeros, con atof podemos convertir a valor flotante

#include<iostream>
#include<stdlib.h> //atoi y atof

using namespace std;

int main(){
    char cad[] = "123";
    char cad2[] = "1234.3234"; //cuidado tiene que ser punto no coma
    int numero;
    int flotante;
    numero = atoi(cad);
    flotante = atof(cad2);
    cout<<numero<<endl;
    cout<<flotante<<endl;

    return 0;
}