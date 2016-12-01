#!/bin/bash

PROGRAM="/opt/teamviewer/tv_bin/script/teamviewer &"
KILL="sudo pkill teamvi*"
PROCESS="ps aux | grep teamvi* | wc -l"

function remote_up () {
$KILL  && $PROGRAM 
}


if [ "${PROCESS}" < 0 ]; then
remote_up;
fi
