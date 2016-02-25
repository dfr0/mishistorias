#!/bin/bash

# ------------------------------------------------------------------
# [Author] Title
#          Description
# i make this script for clean empthy folders
#
#
# --- Options processing -------------------------------------------
#path= /home/mishistorias

function borrar() { 

	for i in $(sudo find ${DEST} -type d -empty -exec {} \;) ; do

		echo $i
	done
}

# --- Locks -------------------------------------------------------
#LOCK_FILE=/tmp/$SUBJECT.lock
#if [ -f "$LOCK_FILE" ]; then
#   echo "Script is already running"
#   exit
#fi
# --- Body --------------------------------------------------------
#  SCRIPT LOGIC GOES HERE

echo "########Script para la limpieza de carpetas vacias##############"

echo

echo "Seleccione las carpetas para escanear" 

echo

read -p 'Origen: ' DEST 

if [ -d  "$DEST" ]; then

sudo find ${DEST} -type d -empty -exec {} \;

echo

echo

echo  "Existen carpetas vacias"

fi

echo 

echo

echo "Quieres borrar las carpetas mencionadas????"

echo

echo "Contesta con si/no"

echo

read -p 'Que dices cerdo? ' RESPUESTA

if [[ "$RESPUESTA" = "si" ]] ;  then

borrar

fi

#-----------------------------------------------------------------
