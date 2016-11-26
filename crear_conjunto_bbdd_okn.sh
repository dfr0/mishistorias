#!/bin/bash

# Nombre: crear_conjunto_bbdd_okn.sh
# Localización del script: PRE /home/atreyu/sh_scripts (NOMBRE HOST y RUTA)
#                          MON1 /var/root/scripts
# Versión: 1.0.0
# Permisos: 770 usuario: atreyu grupo: webmaster
# Autor: Francisco J. Bejarano <francisco.bejarano@openknowledgenetwork.com>
#
# Descripción:
# Script que crea las bbdd de una okn
#
# Log: -
#
# Comentarios:
#
# Frecuencia: Ejecución Manual


################################ Parámetros de configuración

# Nombre cliente de 3 letras en minusculas                                                                                                                                                                         
# o codigo de implementacion                                                                                                                                                                                       
OKNCODE=`echo ${1} | tr [:upper:] [:lower:]`

# MySQL                                                                                                                                                                                                            
BBDD_USER="okn-user"
BBDD_PASS="okn-pass" 
BBDD_HOST="localhost"
BBDD_PORT=3306
BBDD_CHAR="utf8"
BBDD_COLL="utf8_unicode_ci"
APP_MYSQL=`which mysql`
CONEXION="${APP_MYSQL} -h ${BBDD_HOST} -P ${BBDD_PORT} -u ${BBDD_USER} -p${BBDD_PASS}"

# String de ayuda de uso
USO="\n\nUso: `basename $0` IMPLEMENTATION_CODE\n\nIMPLEMENTATION_CODE=codigo de cliente de 3 caracteres alfanumericos. Ejm. rep para Repsol."

#################################### Inicio programa principal

#Comprobamos que se hayan introducido los parametros necesarios

if [ $# != 1 ] ; then
   echo -e "${USO}"
   exit 1
fi


# Creamos las bases de datos necesarias en Preproducción
       
echo "Creando bases de datos vacias..."
$CONEXION -e "create database if not exists okn_${OKNCODE}_main character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_avanzo character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_exams character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_global_english character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_mixpolls character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_scorm character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_tasks character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_tasks_v2 character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_wf_requeriments character set ${BBDD_CHAR} collate ${BBDD_COLL};"
$CONEXION -e "create database if not exists okn_${OKNCODE}_plugins_workgroups character set ${BBDD_CHAR} collate ${BBDD_COLL};"
echo "Bases de datos creadas."

##################################### Fin de Script
