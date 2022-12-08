#include <stdio.h>
#include <unistd.h>
#include <windows.h>
#include <stdlib.h>
int main()
{
    int hr, min, sec;
    hr = min = sec = 0;
    
    while (1)
    {

        // cleare the screen for output
        // for windows use system("cls")
        system("cls");
        // print the time in hr:min:sec format
        printf(" %02d:%02d:%02d ", hr, min, sec);

        
        // clear the buffer in gcc
        fflush(stdout);
        sec++;
        if (sec == 60)
        {
            min++;
            sec = 0;
        }
        if (min == 60)
        {
            hr++;
            min = 0;
        }
        if (hr == 24)
        {
            hr = 0;
            min = 0;
            sec = 0;
        }
        sleep(1);
    }
    return 0;
}
