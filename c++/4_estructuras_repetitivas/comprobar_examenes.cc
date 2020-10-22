/* En una clase de 5 alumnos se han realizado tres examenes y se requiere determinar el numero de:
 *
 * 1- alumnos que aprobaron todos los examenes.
 * 2- alumnos que aprobaron al menos un examen.
 * 3- alumnos que aprobaron unicamente el ultimo examen.
 *
Realice un programa que permite la lectura de los datos y el calculo de las estadisticas.
*/


#include<iostream>

using namespace std;

int main(){
	float examen1,examen2,examen3;
        int aprobadosTodos = 0,aprobadosUno = 0,aprobadosUltimo = 0;	

	for(int i=1;i<=5;i++){
		cout<<i<<".Digite la nota del primer examen: ";cin>>examen1;
		cout<<i<<".Digite la nota del segundo examen: ";cin>>examen2;
		cout<<i<<".Digite la nota del tercer examen: ";cin>>examen3;
		cout<<"\n"; //mejor orden

	if((examen1>10.5)&&(examen2>10.5)&&(examen3>10.5)){//&& tienen que cumplirse todos.
		aprobadosTodos++;

	}
	if((examen1>10.5)||(examen2>10.5)||(examen3>10.5)){
		aprobadosUno++;
	}
	if((examen1<10.5)&&(examen2<10.5)&&(examen3>10.5)){
		aprobadosUltimo++;
    }
}
	cout<<"\nAlumnos que aprobaron todos los examenes: "<<aprobadosTodos<<endl;
	cout<<"\nAlumnos que aprobaron al menos un examen: "<<aprobadosUno<<endl;
	cout<<"\nAlumnos que aprobaron el ultimo examen: "<<aprobadosUltimo<<endl;
return 0;
}
