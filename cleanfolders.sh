#!/bin/sh

# ------------------------------------------------------------------
# [Author] Title
#          Description
# i make this script for clean empthy folders
#
#
# --- Options processing -------------------------------------------
#path= /home/mishistorias
DEST= "/home/myhouse/Music"


# --- Locks -------------------------------------------------------
#LOCK_FILE=/tmp/$SUBJECT.lock
#if [ -f "$LOCK_FILE" ]; then
#   echo "Script is already running"
#   exit
#fi
# --- Body --------------------------------------------------------
#  SCRIPT LOGIC GOES HERE

if $(find ${DEST} -maxdepth 0 -empty -exec echo {} is empthy. \;) ; then

echo "el directorio contiene carpetas vacias $1" 

fi


# -----------------------------------------------------------------
