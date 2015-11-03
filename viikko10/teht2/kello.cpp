//---------------------------------------------------------------------------

#pragma hdrstop

#include "kello.h"
#include <iostream>
using namespace std;

//---------------------------------------------------------------------------
#pragma package(smart_init)
Kello::Kello(int h, int m, int s)
{
        this->tunnit = new Viisari(h,24);
        this->minuutit = new Viisari(m,60);
        this->sekunnit = new Viisari(s,60);
}
void Kello::nayta()
{
        cout << " tunnit: ";
        this->tunnit->nayta();
        cout << " minuutit: ";
        this->minuutit->nayta();
        cout << " sekunnit: ";
        this->sekunnit->nayta();
        cout << "\n";
}
void Kello::kay()
{
        this->sekunnit->etene();
        if (this->sekunnit->annaArvo() == 0)
        {
                this->minuutit->etene();
                if (this->minuutit->annaArvo() == 0)
                        this->tunnit->etene();
        }
}
