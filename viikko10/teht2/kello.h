#include "viisari.h"
//---------------------------------------------------------------------------

#ifndef kelloH
#define kelloH
//---------------------------------------------------------------------------
#endif
class Kello
{
        Viisari *tunnit;
        Viisari *minuutit;
        Viisari *sekunnit;
public:
        Kello(int h, int m, int s);
        //~Kello();
        void nayta();
        void kay();
};
