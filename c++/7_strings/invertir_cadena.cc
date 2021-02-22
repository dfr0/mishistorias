//invertir una cadena - funcion strrev()
//
//
#include<iostream>
#include<string.h>

using namespace std;

int main(){
	char cad[20] = "david"; //no disponible en linux por el gcc osea el compilador

	strrev(cad);

	cout<<cad<<endl;

return 0;
}
