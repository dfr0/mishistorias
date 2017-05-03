#!/bin/bash
# Script para hacer de todo
# Autor: David
#
#

####### Variables ####

CREATE_USER=
CREATE_GROUP="groupadd -g $GID $GRUPO"
SHELL=
TMP_PASS=
USER_LIST=
GROUP_LIST=

#######################
####### MENU ##########


function menu_principal()

{

    echo "1) Monitorizacion"

    echo "2) Gestion de identidades"

    echo "3) Seguridad"

    echo "4) Salir"

    echo

    echo -n "Indica una opcion: "

}

function menu_monitorizacion()

{

    echo

    echo "1) Ver listado de procesos o proceso de interes"

    echo "2) Ver listado de puertos o puerto de interes"

    echo "2) Rendimiento de la maquina"

    echo "3) Salir"

    echo

    echo -n "Indica una opcion: "

}
 

function menu_IDM()

{

    echo

    echo "1) Crear Grupo"

    echo "2) Crear usuario"

    echo "2) Bloquear usuario"

    echo "2) Borrar usuario"

    echo "3) Salir"

    echo

    echo -n "Indica una opcion: "

}

 

function menu_seguridad()

{

    echo

    echo "1) Submenu2-1"

    echo "2) Submenu2-2"

    echo "3) Salir"

    echo

    echo -n "Indica una opcion: "

}



menu=0

until [ $menu -eq 4 ]

do

    case $menu in

        1)

            opc1=0

            until [ $opc1 -eq 3 ]

            do

                case $opc1 in

                    1)

                        echo "menu 1 submenu 1"

                        ;;

                    2)

                        echo "menu 1 submenu 2"

                        ;;

                    *)

                        _submenu1

                        ;;

                esac

                read opc1

            done

            _menuPrincipal

            ;;

        2)

            opc2=0

            until [ $opc2 -eq 3 ]

            do

                case $opc2 in

                    1)

                        echo "menu 2 submenu 1"

                        ;;

                    2)

                        echo "menu 2 submenu 2"

                        ;;

                    *)

                        _submenu2

                        ;;

                esac

                read opc2

            done

            _menuPrincipal

            ;;

        *)

            menuprincipal

            ;;

    esac

    read opc

done




echo "Bienvenido a la herramienta de creacion de usuarios"


read -p "Si hace falta un grupo di no?" GRUPO

read -p "Tienes un GID" GID 

read -p "Clave temporal" TMP_PASS

read -p "¿Que usuario quieres crear?:" USER



if [ -z "$VAR" ];


#### Funciones ########

function create_user {

useradd -m -d /home/exevi -s /bin/bash -u 679 -g utsi -p `openssl passwd -1 Cambiar33` exevi; chage -d 0 exevi  && usermod -a -G utsi exevi

}


