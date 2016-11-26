#!/bin/bash

#### Script para desmontar la unidad/s cifrada/s ####

UNIDAD_CIFRADA="misdatos"
PUNTO_MONTAJE="df | grep ${UNIDAD_CIFRADA} | awk '{print $6}'"
NOMBRE_UNIDAD="datos_sensibles"
PARTICION="/dev/sda5"

function limpiar_pantalla () {
clear
}

limpiar_pantalla

echo "###### Script para el desmontaje de la unidad cifrada ######"
sleep 1
echo "###### Procedemos a desmontar la unidad cifrada #########"
sleep 1
echo "######## Cerramos unidad cifrada si está montada ############# "

	if [[ $PUNTO_MONTAJE == 1 ]];then
	sudo cryptsetup luksOpen $PARTICION 2>&1; sudo mount $UNIDAD_CIFRADA 2>&1;  
	fi

function chequeo_unidad() {
'df' 
}

echo "#### Las unidades montadas actualmente son:" 
	chequeo_unidad
sleep 3
echo ""
exit 0
