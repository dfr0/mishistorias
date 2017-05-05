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
from subprocess import Popen

# Main definition - constants
menu_actions  = {}  

 
# ==================== 
#      Menu Parts      
# ==================== 

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
    choice = raw_input(" >>  ")
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
    choice = input("Selecciona una opcion  ")
    if choice == '1':
	    top()
    exec_menu(choice)
    return
 
# Menu2: Gestion de identidades IDM
def menu2():
    print "Gestion de identidades IDM!\n"
    print "1. Crear usuario en el sistema!\n"
    print "9. Volver"
    print "0. Salir" 
    choice = raw_input(" >>  ")
    exec_menu(choice)
    return
 

# Menu3: Sysadmin Tools
def menu3():
    print "Sysadmin Tools!\n"
    print "1. Reiniciar servidor!\n"
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
 
# Salir del programa
def exit():
    sys.exit()
 
# ==================================
#    Definicion de que hace el menu
# ==================================
 
# Menu definition
menu_actions = {
    'main_menu': main_menu,
    '1': menu1,
    '2': menu2,
    '3': menu3,
    '4': menu4,
    '9': back,
    '0': exit,
}
 
# =================================
#     Menu: Programacion principal
# =================================
 
# Programa principal

if __name__ == "__main__":

    # Lanzar menu principal
    main_menu()


# =================================================
#    Menu: Programacion de las funciones del menu
# =================================================

	




