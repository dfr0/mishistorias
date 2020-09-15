#include<iostream>
#define FRIEND 1
int main (void)
{
	char msg[200];
	std::cout << "Escribe tu nombre: ";
	std::cin>> msg ;
	std::cout << "## "; 
	std::cout << msg ;
	std::cout << " ## "; 
#ifdef FRIEND
		std::cout <<  " Aqui tu mensaje " << msg;
#endif
	return 0 ;
}
