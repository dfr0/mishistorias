#!/usr/bin/env python
# -*- coding: utf-8 -*-
#title           :skynet.py
#description     :Menu para el Administrador de sistemas perfecto
#author          :David Faro
#date            :27/04/2017
#version         :0.1
#usage           :python skynet.py
#notes           :
#python_version  :  
#=======================================================================
 
# Import the modules needed to run the script.
import sys, os

# Main definition - constants
menu_actions  = {}  
 

# =============== #
# Menu Functions  #
# =============== #


# Menu principal
def main_menu():
    os.system('clear')
    
    print "Bienvenidos a Skynet,\n"
    print "Please choose the menu you want to start:"
    print "1. Monitorizacion"
    print "2. Gestion IDM"
    print "3. Sysadmin Tools"
    print "4. Security"
    print "\n0. Salir"
    elecion = raw_input(" >>  ")
    exec_menu(choice)
 
    return
 
# Execute menu
def exec_menu(choice):
    os.system('clear')
    ch = choice.lower()
    if ch == '':
        menu_actions['main_menu']()
    else:
        try:
            menu_actions[ch]()
        except KeyError:
            print "Opción invalida, elije otra.\n"
            menu_actions['main_menu']()
    return
 
# Menu1: Monitorizacion
def menu1():
    print "MONITORIZACION!\n"
    print "1. CPU, Memory, process, etc..."
    print "9. Volver"
    print "0. Salir"
    choice = raw_input(" >>  ")
    exec_menu(choice)
    return
 
 
# Menu2: Gestion de identidades IDM
def menu2():
    print "Gestion de identidades IDM!\n"
    print "Crear usuario en el sistema!\n"
    print "9. Volver"
    print "0. Salir" 
    choice = raw_input(" >>  ")
    exec_menu(choice)
    return
 

# Menu3: Sysadmin Tools
def menu3():
    print "Sysadmin Tools!\n"
    print "1. Reboot computer !\n"
    print "9. Volver"
    print "0. Salir"
    choice = raw_input(" >>  ")
    exec_menu(choice)
    return

# Menu4: Security
def menu4():
    print "Seguridad/Hacking!\n"
    print "1. Escaneo de puertos Nmap"
    print "9. Volver"
    print "0. Salir"
    choice = raw_input(" >>  ")
    exec_menu(choice)
    return

# Volver al menu principal
def back():
    menu_actions['main_menu']()
 
# Exit program
def exit():
    sys.exit()
 
# =======================
#    MENUS DEFINITIONS
# =======================
 
# Menu definition
menu_actions = {
    'main_menu': main_menu,
    '1': menu1,
    '2': menu2,
    '9': back,
    '0': exit,
}
 
# =======================
#      MAIN PROGRAM
# =======================
 
# Main Program
if __name__ == "__main__":
    # Launch main menu
    main_menu()






# This Python file uses the following encoding: utf-8
import os, sys

def menu():
	"""
	Función que limpia la pantalla y muestra nuevamente el menu
	"""
	os.system('clear') # NOTA para windows tienes que cambiar clear por cls

	print ("Selecciona una opción")

	print ("\t1 - Monitorizacion")

	print ("\t2 - Gestion de identidades IDM")

	print ("\t3 - ADM Herramientas de administradores")

	print ("\t9 - salir")

while True:

	# Mostramos el menu

	menu()

	# solicitamos una opción al usuario
	opcionMenu = input("inserta un numero valor >> ")


	if opcionMenu=="1":

		print ("")

		input("Monitorizacion...\npulsa una tecla para continuar")


	elif opcionMenu=="2":

		print ("")

		input("Has pulsado la opción 2...\npulsa una tecla para continuar")

	elif opcionMenu=="3":

		print ("")

		input("Has pulsado la opción 3...\npulsa una tecla para continuar")

	elif opcionMenu=="9":

		break

	else:

		print ("")

		input("No has pulsado ninguna opción correcta...\npulsa una tecla para continuar")


#### Crear Grupo

	@ Create_group()
	os.system('groupadd -g ')
	


