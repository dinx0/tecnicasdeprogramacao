# tecnicasdeprogramacao
APS
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <iostream>
#include <conio.h>
#include <windows.h>

using namespace std;

int main()
{
  float x,y;
  int op;
  setlocale(LC_ALL,""); 
  SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), 12);
  printf("\nAtividade Supervisionada");
  cout << "\n=========================";
  SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), 12);
  printf("\nUNIVERSIDADE ANHEMBI MORUMBI");
  cout << "\n=========================";
  SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), 4);
  printf("\nGRUPO :Pedro Vieira/Geovanni Bonanno/Diego Soares");
  SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), 4);
  printf("\nRA:RA:21338964/RA:21359611/RA:21133697");
  SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), 10);
  cout << "\n=========================";
  cout << "\nUNIVERSIDADE ANHEMBI MORUMBI";
  cout << "\n=========================";
  cout << "\nDigite a opção desejada: ";
  cout << "\n=========================";
  cout << "\n(1) Adição";
  cout << "\n(2) Subtração";
  cout << "\n(3) Multiplicação";
  cout << "\n(4) Divisão";
  cout << "\n";
  cin >> op;
  switch(op)
  {
    case 1:
    	setlocale(LC_ALL,"");
      cout << "\nDigite um número: ";
      cin >> x;
      cout << "\nDigite outro número: ";
      cin >> y;
      cout << "\n\nA adição é: " << x+y;
    break;
    case 2:
      cout << "\nDigite um número: ";
      cin >> x;
      cout << "\nDigite outro número: ";
      cin >> y;
      cout << "\n\nA subtração é: " << x-y;
    break;
    case 3:
      cout << "\nDigite um número: ";
      cin >> x;
      cout << "\nDigite outro número: ";
      cin >> y;
      cout << "\n\nA multiplicação é: " << x*y;
    break;
    case 4:
      cout << "\nDigite um número: ";
      cin >> x;
      cout << "\nDigite outro número: ";
      cin >> y;
      if(x==0 && y==0)
        {
          cout << "\n\nA divisão é: 0";
          if(x!=0 && y==0)
            cout << "\n\nIsso é uma indeterminação!";
          else
            cout << "\n\nA divisão é: " << x/y;
        }
    break;
    default:
      cout << "\nOpção inválida!";
    break;
  }
  return 0;
}
