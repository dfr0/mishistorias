#include<iostream>
#include<stdlib.h>
#include<string.h>

using namespace std;

int main(){
    char palabra1[20],palabra2[20];

    cout<<"Digite una palabra: ";cin.getline(palabra1,20,'\n');
    cout<<"Digite una otra palabra: ";cin.getline(palabra2,20,'\n');

    //pasando a mayusculas ambas palabras
    strdup(palabra1);
    strdup(palabra2);

    if(strcmp(palabra1,palabra2)==0){
        cout<<"ambas palabras son iguales"<<endl;
    }
    else {
        cout<<"las palabras no coinciden"<<endl;
    }

getchar();
return 0;
}