/* escriba un programa que tome cada 4 horas la temperatura exterior, leyendola durante un periodo de 24 horas. Es decir debe leer 6 temperaturas.
 * calcule la temperatura media del dia, la temperatura mas altas y la mas baja */

#include<iostream>

using namespace std;

int main(){
	float temperatura,mayor=0,menor=999;
	float sumaTotal,promedio = 0;

	for(int i=0;i<=24;i+=4){ //aqui no usamos i++ por aqui necesitamos aumentar de 4 en 4. igual a i + 4
		cout<<"Digite la temperatura de la hora: "<<i<<": ";
		cin>>temperatura;
		sumaTotal = sumaTotal + temperatura;
		// ahora vamos a calcular la temperatura mayor y menor
	}
	if (temperatura > mayor){
		mayor = temperatura; //24, irá guardando la mayor temperatura.
	}
	if (temperatura < menor){
		menor = temperatura; // es una trampa para que guarde la temperatura menos
	}

	promedio = sumaTotal/6;
	
	cout<<"\Temperatura media: "<<promedio<<endl;
	cout<<"\Temperatura mayor: "<<mayor<<endl;
	cout<<"\Temperatura menor: "<<menor<<endl;
	

return 0;
}
