#include <iostream>
using namespace std;
//---------------------------------------------------------------------------

#pragma hdrstop

#include "viisari.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
Viisari::Viisari(int alkuarvo, int maksimi)
{
        arvo = alkuarvo;
        max = maksimi;
}
void Viisari::nayta()
{
        cout << arvo;
}
void Viisari::etene()
{
        arvo = (arvo+1)%max;
}
int Viisari::annaArvo()
{
        return arvo;
}
