#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8

import sys, os, math

#===================================================================
#	[DavidD:]
#   	Description:
#	Que hace el script: Este script esta destinado a probar 
# 	ciertos elementos basicos de seguridad
#
#	Uso del script:
#===================================================================
# Variables:

cabecera = "====================="

# =================================================
#    Menu: Programacion de las funciones del menu
# =================================================
def nmap(sfirewall):
	def sfirewall():
		os.system('nmap -PN', host) 
	return
 
# ==================== 
#      Menu Parts      
# ==================== 

menu_actions  = {}  

# Menu principal
def main_menu():
    os.system('clear')
    
    print '''MrROBOT'''
    print
    print "Elige una opcion:"
    print cabecera
    print "1. Escaneo de puertos"
    print "2. Captura de paquetes"
    print "3. Crackear"
    print "4. Vulnerabilidad Web"
    print "666. Seleccionar un objetivo"
    print "\n0. Salir"
    print cabecera
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
 

def nmap_menu():
    os.system('clear')
    
    print 
    print "Elige una opcion:"
    print "1. Escaneo de Firewall"
    print "\n0. Salir"
    choice = raw_input(" >>  ")
    exec_menu(choice)
    return


# Volver al menu principal
def back():
    menu_actions['main_menu']()
 
# Salir del programa
def exit():
    sys.exit()

def target():
	host = input("Nombre o ip del Host a atacar :")
	print("Has seleccionado", host)
    	menu_actions['main_menu']()
 
# =====================================
#    Definicion de que hacen los menus
# =====================================
 
# Menu definition
menu_actions = {
    'main_menu': main_menu,
    '1': nmap,
    '666': target,
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



	




