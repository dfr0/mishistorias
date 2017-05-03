#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8

import requests, sys

#enlace = raw_input(sys.argv[1])

url = raw_input("Que web quieres chequear?: ")
response = requests.get(url)
response.time = requests.get(url).elapsed.total_seconds

print ("Respuesta de la web", response.status_code)
print ("Tiempo de respuesta", response.time)



