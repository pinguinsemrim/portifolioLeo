
#!/bin/bash
echo ravenfield -1
echo fanfdoom -2
echo outro -3
echo sair -4
read a
if [ $a -eq 1 ]	
then
start ~/Downloads/Ravenfield_B5_1_Windows/Ravenfield/Ravenfield.exe
elif [ $a -eq 2 ]
then
start ~/Downloads/FiveNightsAtFreddysDOOM/FDLauncher.exe
elif [ $a -eq 3 ]
then 
 	echo ainda não implementado
else
	echo tchou
fi
