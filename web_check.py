#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8
#Check Webpage By David F

import requests, sys, os, math

from colorama import init, Fore, Back, Style

''' Formateo de estilos al arrancar '''

init(autoreset=True)

''' Borrado de pantalla al inicio '''

os.system('clear')

''' Listado de variables globales '''

cabecera = ("===============================")
url = raw_input("Que web quieres chequear?: ")
segundos = int(input("Segundos del escaneo: "))
segundos = int(segundos)
badtime = +0.8
apacheok = range(200,208)
apacheredirect = range(300,308)
apacheclienterror = range(400, 451)
apacheservererror =  range(500, 512)

def chequeo():
  response = requests.get(url)
  response.time = requests.get(url).elapsed.total_seconds()
  print(Style.DIM + cabecera + Style.RESET_ALL)
  print(Style.BRIGHT + "Web chequeada: " + Style.RESET_ALL +  url)
  rcode = ("Codigo de respuesta", response.status_code)
  rtime = ("Tiempo de respuesta", response.time) 
  if rtime[1] > badtime:
	  print(Fore.RED + 'BAD TIME' + Style.RESET_ALL)
	  print(rtime)
  else:
	  print(Fore.GREEN + 'GOOD TIME' + Style.RESET_ALL)
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

print Fore.CYAN + "Terminamos el escaneo" + Style.RESET_ALL










