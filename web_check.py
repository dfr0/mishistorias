#!/usr/bin/python2.7
# This Python file uses the following encoding: utf-8

import sys, os, requests

url = str(sys.argv[1])
#p = format(sys.argv[2])

r = requests.get (url)

print ('Web chequeada: ',url)
print ('Codigo Respuesta: ', r)

