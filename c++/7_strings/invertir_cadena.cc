//invertir una cadena - funcion strrev()
//
//
#include<iostream>
#include<string.h>
#include<algorithm>

using namespace std;

int main(){
	string cad = "David";
	reverse(cad.begin(), cad.end()); //tenemos que usar reverse porque en POSIX no tenemos strrev
	cout<<cad<<endl;
}
