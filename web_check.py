#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8
#Check Webpage By David F

import requests, sys


url = raw_input("Que web quieres chequear?: ")
segundos = int(input("Segundos del escaneo: "))
segundos = int(segundos)
badtime = int(0.1)

def chequeo(self):
   response = requests.get(url)
   response.time = requests.get(url).elapsed.total_seconds()
   print ("Web chequeada", url)
   print ("Respuesta de la web", response.status_code)
   print ("Tiempo de respuesta", response.time)
   
while (segundos > 0):
    chequeo()
    print ('Tiempo restante del chequeo:', segundos)
    segundos = segundos - 1



#if badtime => response.time
#print ("Tiempo de respuesta alto")
#else:
#print ("Tiempo de respuesta optimo")



print "Terminamos el escaneo"



