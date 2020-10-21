//hacer un programa que realice la serie fibonacci -> 1 1 2 3 5 8 13 ....n a partir del 1 1 se suma el numero anterior. 
//
//
#include<iostream>

using namespace std;

int main(){

	int n,x=0,y=1,z=1;

	cout<<"\nDigite el numero de elementos: ";cin>>n;
	cout<<"1 ";
	for (int i=1;i<=n;i++){
				//este algoritmo no sale de la nada, es el fibonacci.
		z = x + y; //vale 1 luego 2 luego 3 luego 5
		cout<<z<<" ";//vale 1 luego 2 luego 3 luego 5
		x = y;//vale 1 luego 1 luego 2
		y = z;//vale 1 luego 2 luego 3

	}
cout<<"\n";
return 0;
}
