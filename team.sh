#!/bin/bash

PROGRAM="/opt/teamviewer/tv_bin/script/teamviewer &"
KILL="sudo pkill teamvi*"
COUNT="ps aux | grep teamviewer | grep -v grep | wc -l"


function remote_up() {
$KILL && echo "Starting remote asistant" && $PROGRAM
}

while [ $COUNT -lt 1 ]
do remote_up
done
