#!/bin/bash

# limpiar el historyco

BLEACHBIT=`witch bleachbit`

if [ $BLEACHBIT == false]
"sudo apt-get install bleachbit"
fi

function limpieza() {
bleachbit -c "gnome.search_history google_chrome.cache google_chrome.cookies google_chrome.form_history google_toolbar.search_history google_chrome.history vlc.mru"
}
