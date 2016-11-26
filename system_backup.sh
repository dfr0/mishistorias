#!/bin/sh

# ------------------------------------------------------------------
# [Author] Title
#          Description
# ------------------------------------------------------------------

# Directorios de donde se haran las copias de seguridad:

DAY=`date +%d`
MONTH=`date +%m`
YEAR=`date +%Y`
BKDIR="/home/$USER/misbackups/$YEAR/$MONTH/$DAY"
BKLOG="/home/$USER/misbackups/$YEAR/$MONTH/$DAY.log"
ARRPOS="0" 

echo "Quieres hacer un backup?"

echo

echo "Responde si/no"

echo

read -p '' HACEMOSBACKUP

echo 

echo --------------------------------------------------

if [[ "$HACEMOSBACKUP" = "si" ]]; then

echo "procedemos a realizar la copia"

wait 2

touch $BKLOG
echo "To: frodorik21@gmail.com" >> $BKLOG;
echo "From:Backups <Backup@myself>" >> $BKLOG;
echo -e "Subjetct: Backup from `hostname` on $YEAR.$MONTH.$DAY" >> $BKLOG;
echo -e ">> Backup for: $YEAR.$MONTH.$DAY started @ `date +%H:%M:%S`n" >> $BKLOG;

elif [ ! -d "$BKDIR" ]; then

echo "creamos la carpeta donde se hara la copia" >> $BKLOG ; mkdir -p $BKDIR

else

echo "Bye Bye"

wait 3

exit 0

fi

# Comienza el cuerpo del script


echo "De que quieres hacer el backup???"

read MENU

case $MENU

1) 

echo "Backup del sistema"
;;

2)

echo "Backup de los datos personales"
;;

3)

echo "Otro tipo de backup"
;;


# --- Options processing -------------------------------------------

case "Quieres hacer un backup del sistema"

tar cpzf





# --- Locks -------------------------------------------------------
#LOCK_FILE=/tmp/$SUBJECT.lock
#if [ -f "$LOCK_FILE" ]; then
#   echo "Script is already running"
#   exit
#fi
# --- Body --------------------------------------------------------
#  SCRIPT LOGIC GOES HERE


# -----------------------------------------------------------------

