#!/bin/bash

HOST=$1

read -p 'clave a sustituir: ' CLAVE

function logica(){

extract="`echo ${HOST:0:2}`"

p="`echo ${CLAVE:0:5}`$extract`echo ${CLAVE:7:1}`" 

pr="`echo ${CLAVE:0:5}`$extract`echo ${CLAVE:7:0}`" 

if [[ ${HOST} == *pre* ]]; then
echo "maquina de preproduccion, clave  ${pr}" 
else
echo "maquina de produccion, clave ${p}"  
fi
}

logica
