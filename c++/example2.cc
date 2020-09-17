# include <iostream>
int global = 5;

int main (void) 
{
int a =1;
double x = 1.2;
double y = 2.3;

	std::cout << "x+y=" << x+y << " " << "a=" << a;
	a=global + (int) x;
	std::cout << "a=" << a ;
	return 0;
}
