/* realice un programa que lea una cadena de caracteres de la entrada estandar y muestre en la salida estandar cuantas ocurrendias de cada vocal existe en la cadena
 A switch statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.
switch(expression) {
   case constant-expression  :
      statement(s);
      break; //optional
   case constant-expression  :
      statement(s);
      break; //optional
  
   // you can have any number of case statements.
   default : //Optional
      statement(s);
}
*/

#include<iostream>
#include<string.h>

using namespace std;

int main(){
    char frase[30];
    int vocal_a=0;vocal_e=0;vocal_i;vocal_o=0;vocal_u=0;

    cout<<"digite una frase";cin.getline(frase,30,'\n');

    for(int i=0;i<30;i++){
        switch(frase[i]{
            case 'a': vocal_a++;break;
            case 'e': vocal_e++;break;
            case 'i': vocal_i++;break;
            case 'o': vocal_o++;break;
            case 'o': vocal_u++;break;
        })

    cout<<"Vocal a: "<<vocal_a<<endl;
    cout<<"Vocal e: "<<vocal_e<<endl;
    cout<<"Vocal i: "<<vocal_i<<endl;
    cout<<"Vocal o: "<<vocal_o<<endl;
    cout<<"Vocal u: "<<vocal_u<<endl;

    }    
    return 0;
}