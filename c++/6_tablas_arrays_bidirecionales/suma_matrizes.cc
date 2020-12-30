//realice un programa que calcule la suma de dos matrices cuadradas de 3x3.

#include<iostream>
#include<ncurses.h>

using namespace std;

int main() {
	int matriz[3][3],matriz2[3][3];

	for(int i=0;i<3;i++){
		for (int j=0;j<3;j++){
		cout<<"Defina su primera matriz ["<<i<<"]["<<j<<"] ";cin>>matriz[i][j];
		}
		cout<<"\n";
	}

        for(int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                cout<<"Defina su segunda matriz ["<<i<<"]["<<j<<"] ";cin>>matriz2[i][j];
                }
                cout<<"\n";
        }

	cout<<"La suma de las dos matrices es"<<endl;
	for(int i=0;i<3;i++){
                for (int j=0;j<3;j++){
		cout<<matriz[i][j] + matriz2[i][j]<<" ";
		}
		cout<<"\n";
	}
}
