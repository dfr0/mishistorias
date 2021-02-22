//invertir una cadena - funcion strrev()
//
//
#include<iostream>
#include<string.h>
#include<algorithm>

using namespace std;

int main(){
	cout << "\nenter string to check palindrome:"; //palindroma es una palabra que si la lees al principio o al final es igual.
	string str;
	getline(cin, str);
	string ostr = str;
	reverse(str.begin(), str.end());
	if(str==ostr)
	cout<<"\n String is palindrome";
	else
	cout<<"\n String is not palindrome";
}
