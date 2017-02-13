#!/bin/bash
# Variables
list=$1
execute=$2
log="execute_command.log"
date_now=$(date +"%d-%h-%Y %H:%M")

# Ejemplo de uso del script
display_usage() {
        echo
        echo "El uso del script es:"
        echo -e "./script lista_hosts comando\n"
        }
# Si no se meten argumentos mostramos el uso del script
        if [  $# -le 1 ]
        then
                display_usage
                exit 1
        fi
# Ver la ayuda del script

        if [[ ( $# == "--help") ||  $# == "-h" ]]
        then
                display_usage
                exit 0
        fi
# Funciones

function hide() {
stty -echo
read -p "Clave de $USER " PWD
stty echo
}

function execute_command() {
for i in $(cat $list); do echo "$i  $date_now  " ; sshpass -p "$PWD" ssh -t -o ConnectTimeout=5 $USER@$i su - -c $execute;done > $log | tailf $log
}

# Entrada de la variable del usuario para la conexion ssh

read -p "Usuario para la conexion " USER

##### SCRIPT MAIN ##########

# Oculta la contraseña del usuario de la conexión

hide

# Conexion ssh y ejecucion del comando lanzado desde el teclado

execute_command
