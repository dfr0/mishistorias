//pasar una palabra a MAYUSCULA - funcion strupr()
#include<iostream>
#include<string.h>
#include<iostream>
#define _POSIX_SOURCE

using namespace std;

int main()
{
char str1[] = "new zealand";
cout<<"Original String value : " << str1 << "\n";
strupr(str1);
cout<< "String's upper case value : " << str1;

return 0;
}