/*la sentencia do while (primero actua y luego piensa)
 

  do{
      conjunto de intrucciones; //se ejecuta si o si al menos una vez
      } while(expresion logica);
      */

#include<iostream>
#include<stdlib.h>

using namespace std;

int main(){
	int i;

	i = 1; //al igual que while el iterador se tiene que definir fuera del bucle

	do{
		cout<<i<<endl;
		i++; //aumenta el iterador de 1 en 1
	}while(i<=10); //se cumple hasta que sea el iterador menor o igual que 10.


	getchar(); // es lo mismo que el system("pause") pero para linux

	// system("pause"); //igual que el getch o getchar

	/* The system(...) function in C takes a command as string (which is a char array in C) and passes it to the operating system's default command processor/shell to execute it.

On Windows, this would by done by cmd.exe, which has an internal command pause that prints something like "Press any key to continue..." and waits for a keyboard event before it quits.

However, Ubuntu luckily does not have cmd.exe, but uses sh here as its default shell (which is dash internally), which does not have a pause command. You can use something like this instead:
*/

	return 0;
}
