/*Calculo de consumo electrico de un aparato.

Lo primero que se debe hacer para poder calcular el consumo energético de una vivienda es conocer la potencia de cada uno de los aparatos eléctricos de la misma. La unidad de medida de la potencia eléctrica de todos los aparatos, que aparece reflejada en los manuales o las placas identificativas de estos, es el vatio (W).

Sin embargo, para calcular el consumo se utilizan los kW, el equivalente a 1000 vatios. Estos se multiplican por las horas de gasto para conseguir los kWh (Kilovatios/hora), que indican el consumo energético diario de la vivienda. Luego, si se quiere obtener el consumo por semanas, meses o años, se debe multiplicar los kWh por el periodo de tiempo en concreto.

Esto significa que el consumo de cualquier equipo dependerá de la potencia del mismo (que siempre es la misma) y del tiempo que se encuentre conectado.

W / 1000 = kW
kW x horas de uso= kWh diarios consumidos por el aparato
kWh x días del mes = consumo energético mensual*/


#include<iostream>
#include<math.h>

using namespace std;

int main (){
	float watts, gasto_mensual,conversion_kwatts;
	int uso,horas;
	
	cout<<"\nCuantos wattios de potencia tiene tu aparato? ";cin>>watts;
	cout<<"\nCuantas horas lo usas al día? ";cin>>horas;

	conversion_kwatts = watts / 1000 ;
	uso = (horas * 30);
	gasto_mensual = uso * watts;
	
	cout<<"\nEl gasto mensual de tu aparato es de Kwh: "<<gasto_mensual<<endl;

return 0;
}
