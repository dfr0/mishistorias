//pasar palabra a miniscula
#include<iostream>
#include<string.h>
#include<stdlib.h>

using namespace std;

int main(){

    char palabra[] = "DAVID";

    strlwr(palabra);
    cout<<palabra<<endl;

    getch();
    return 0;
}