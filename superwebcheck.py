#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8
#Check Webpage By David F

''' Pendientes: Tengo pendiente hacer la media aritmetica, meter algo entorno a la seguridad'''

import requests, sys, os, math, ssl, re
from colorama import init, Fore, Back, Style
from collections import Counter

''' Formateo de estilos al arrancar '''

init(autoreset=True)

''' Borrado de pantalla al inicio '''

os.system('clear')

''' Listado de variables globales '''

cabecera = ("===============================")
url = raw_input("Que web quieres chequear?: ")
segundos = int(input("Numero de chequeos a realizar wey: "))
#patron = raw_input("Patron a buscar en la web: ")
#patron_search =  search(patron)
segundos_iniciales = segundos
segundos = int(segundos)
badtime = +0.8
apacheok = range(200,208)
apacheredirect = range(300,308)
apacheclienterror = range(400, 451)
apacheservererror = range(500, 512)

''' La chicha '''

def chequeo():
 
  response = requests.get(url)
  #response.content
  response.time = requests.get(url, timeout=10).elapsed.total_seconds()
  print(Style.DIM + cabecera + Style.RESET_ALL)
  print(Style.BRIGHT + "Web chequeada: " + Style.RESET_ALL +  url)
  rcode = ("Codigo de respuesta", response.status_code)
  rtime = ("Tiempo de respuesta", response.time)
  if rtime[1] > badtime:
	  print (Fore.RED + 'MALOS TIEMPOS DE RESPUESTA' + Style.RESET_ALL)
	  error_counter = 0
  	  error_counter = error_counter +1
	  print(rtime)
  else:
	  print (Fore.GREEN + 'BUENOS TIEMPOS DE RESPUESTA' + Style.RESET_ALL)
	  print(rtime)
  if rcode[1] in apacheok:
	  print(Fore.GREEN + 'PETICIONES CORRECTAS' + Style.RESET_ALL)
	  print(rcode)
  elif rcode[1] in apacheredirect:
	  print(Fore.BLUE + 'REDIRECCION' + Style.RESET_ALL)
	  print(rcode)
  elif rcode[1] in apacheclienterror:
	  print(Fore.RED + 'ERROR EN EL CLIENTE' + Style.RESET_ALL)
	  print(rcode)
  elif rcode[1] in apacheservererror:
	  print(Fore.RED + 'ERROR EN EL SERVIDOR' + Style.RESET_ALL)
	  print(rcode)
  else:
	  print("RESPUESTA DESCONOCIDA")
	  print(rcode)

while (segundos > 0):
	chequeo()
	print('Numero de pruebas: ')
       	print('Restantes: ', segundos)
       	segundos = (segundos - 1)


''' Muestra los resultados  '''

ok_counter = (segundos_iniciales - error_counter)


print
print cabecera
print Fore.BLACK + "RESULTADOS" + Style.RESET_ALL
print cabecera
print Fore.BLACK + "ESCANEO FINALIZADO" + Style.RESET_ALL
print cabecera
print Fore.CYAN + "NUMERO DE PRUEBAS: " + Style.RESET_ALL , segundos_iniciales
print Fore.RED + "PETICIONES FALLIDAS ERRORES: " + Style.RESET_ALL , error_counter
print Fore.GREEN + "PETICIONES CORRECTAS: " + Style.RESET_ALL , ok_counter






