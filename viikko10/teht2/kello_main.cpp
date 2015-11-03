//---------------------------------------------------------------------------
#include <iostream>
#include <stdio.h>
using namespace std;
#include "kello.h"
#pragma hdrstop

//---------------------------------------------------------------------------

#pragma argsused
int main()   
{
        Kello rolex(10,58,58);
        rolex.nayta();
        for  (int i=0; i<100; i++)
        {
                rolex.kay();
                rolex.nayta();
        }
        getchar();
        return 0;
}

//---------------------------------------------------------------------------
 
