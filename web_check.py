#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8
#Check Webpage By David F

import requests, sys


url = raw_input("Que web quieres chequear?: ")
segundos = int(input("Segundos del escaneo: "))
segundos = int(segundos)
badtime = int(0.1)

def chequeo():
    response = requests.get(url)
    response.time = requests.get(url).elapsed.total_seconds()
    print ("Web chequeada", url)
    print ("Respuesta de la web", response.status_code)
    print ("Tiempo de respuesta", response.time)

def contador():   
    while (segundos > 0):
    return chequeo
    print ('Tiempo restante del chequeo:', segundos)
    segundos = segundos - 1


#print ("Respuesta de la web", response.status_code)
#	if response.status_code => badtime:
#print ("malos tiempos de respuesta")
#	else:
#print ("Buenos tiempos de respuesta")




print "Terminamos el escaneo"



