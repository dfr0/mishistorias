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

	function Create_group()
	os.system('groupadd -g gid grupo')
	


