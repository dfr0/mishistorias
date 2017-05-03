#!/bin/bash

# Variables
list=$1
execute=$2
timestamp=$(date "+%Y-%m-%d %H:%M:%S")
log="execute_command.log"

###AYUDA####

display_usage() {
        echo "El uso del script es: "
        echo -e "./script lista_de_hosts comando\n"
	echo
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
###Funciones menores####

function inicio() {
	wall -n "##### SCRIPT EN EJECUCION, CUIDADO CON REINICIAR####"
		
}

function final() {
        wall -n "##### EJECUCION DEL SCRIPT TERMINADO ####"
}

function reset_color() {
	echo "$(tput sgr0)"
}

function morado() {
	echo "$(tput setaf 5)"
}

function verde() {
        echo "$(tput setaf 2)"
}

function bold() {
	echo -e "\e[1m"
}
	
function hide() {
	stty -echo
	read -p "Clave de $USER " PWD
	stty echo
}
function hide_root() {
	echo
	stty -echo
	read -p "Patron de root: " CLAVE
	stty echo
}


function expect(){
#!/usr/bin/expect -f
spawn su -
expect "login:" 
send "username\r"
expect "Password:"
send "password\r"
interact
}

masterpass="echo $CLAVE | ./logica.sh $(cat $list) |awk '{print $5}'"


# Funcion principal
function execute_command() {

for i in $(cat $list); do echo "######$i $timestamp#####";echo $CLAVE | ./logica.sh $i |awk '{print $5}'; sshpass -p $PWD ssh -t -o ConnectTimeout=5 $USER@$i su - --session-command=$execute ;done  
#for i in $(cat $list); do echo "######$i $timestamp#####"; echo $CLAVE | ./logica.sh $i; sshpass -p $PWD ssh -t -o ConnectTimeout=5 $USER@$i su - --session-command=$execute ;done | tee -a $log 
#for i in $(cat $list); do echo "######$i $timestamp#####"; sshpass -p $PWD ssh -t -o ConnectTimeout=5 $USER@$i su - < $(echo $CLAVE | ./logica.sh $i | awk '{print $5}'); $execute ;done | tee -a $log 
}

# Entrada de la variable del usuario para la conexion ssh

reset_color 

bold

#inicio

morado

read -p "Usuario para la conexion " USER

##### SCRIPT MAIN ##########

# Oculta la contraseña del usuario de la conexión

hide

hide_root

# Formato de salida de la consola, Conexion ssh y ejecucion del comando lanzado desde el teclado

reset_color

bold

verde

execute_command 

reset_color

#final
