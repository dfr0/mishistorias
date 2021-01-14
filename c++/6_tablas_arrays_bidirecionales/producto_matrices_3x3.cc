//realize un programa que calcule el producto de dos matrices cuadradas de 3x3
//
//
#include<iostream>

using namespace std;

int main(){
	int A[3][3] = {{1,2,1},{2,1,1},{2,1,2}};
	int B[3][3] = {{3,2,1},{2,3,1},{1,1,3}};
	int C[3][3];

	//multiplicar las matrices de 3x3
	for(int i= 0;i<3;i++){
		for(int j= 0;j<3;j++){
			C[i][j] = 0;
			for(int k=0;k<3;k++)
				C[i][j] = C[i][j] + A[i][j]*B[i][j];
		}
	}

	cout<<"Matriz resultante de la multiplicacion es ";
	for(int i= 0;i<3;i++){
                for(int j= 0;j<3;j++){
			cout<<C[i][j]<<" ";
			}
		cout<<"\n";
	}

	return 0;
}
