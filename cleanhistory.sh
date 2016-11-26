#!/bin/bash

echo "########## script que limpia el historico del navegador #########"
echo ""

BLEACHBIT=`whereis bleachbit`

	if [[ ${BLEACHBIT} == 0 ]]; then
	echo "instalando bleachbit" && "sudo apt-get install bleachbit";
	else
	echo "bleachbit instalado en el sistema"
	fi
echo ""
echo ""


function limpieza() {
for i in $(bleachbit -l) ; do bleachbit -c $i; exit 0;  done 
}

echo "procedemos a limpiar el sistema para salvaguardar la privacidad"
limpieza 2>&1

echo ""
echo ""


