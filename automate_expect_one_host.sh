#!/bin/bash
 
###Variables### 

server=$1;
execute=$2;
salir=exit;



export HISTIGNORE="expect*";

###AYUDA####

como_usar() {
        echo "El uso del script es: "
        echo -e "./script host "comando/s"\n"
        echo
        }

# Si no se meten argumentos mostramos el uso del script
        if [  $# -le 1 ]
        then
                como_usar
                exit 1
        fi
# Ver la ayuda del script

        if [[ ( $# == "--help") ||  $# == "-h" ]]
        then
                como_usar
                exit 0
        fi

###Funciones###

function logica(){
CLAVEBUENA=$(for i in $(cat $list);do echo $CLAVE | ./logica.sh $i;done)
}


function hide_user() {
        stty -echo
	read -p 'Usuario para la conexion: ' username
        stty echo
}
function hide_pass() {
        echo
        stty -echo
	read -p "Clave del usuario $username: " pass
        stty echo
}

 
hide_user

hide_pass

###Expect####
	expect -c "
        set timeout 1
	spawn ssh $username@$server
        expect "?assword:"
        send \"$pass\r\"
	expect \"*bash*\"
        spawn su -l root
        send \"$CLAVEBUENA\r\"
	expect \"*#\"
        send \"$execute\r\"
	expect \"*#\"
        send \"$salir\r\"
        expect eof"

export HISTIGNORE="";




