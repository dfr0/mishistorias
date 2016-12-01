#!/bin/bash

DEVICE="/dev/sda5"
PARTITION_NAME="misdatos"
DEVICE_NAME="datos_sensibles"
DEVICE_MAP="/dev/mapper/${PARTITION_NAME}"
DEVICE_MOUNT_POINT="/mnt/${PARTITION_NAME}"

echo "####Proceso para montar la unidad cifrada####"

echo "####Abrimos la unidad con la clave ##########"

function open_disk(){
sudo cryptsetup luksOpen "${DEVICE}" "${PARTITION_NAME}"
}

open_disk


	if [-d "${DEVICE_MOUNT_POINT}"]; then	
	mkdir ${DEVICE_MOUNT_POINT}
	echo "###Creamos directorio para el montaje####"
	else
	echo "###El directorio ya existe no hace falta crearlo#####"
	fi

echo "###### montamos directorio cifrado####"

function mount_disk() {
sudo mount -t ext4 ${DEVICE_MAP} ${DEVICE_NAME}
}

mount_disk
