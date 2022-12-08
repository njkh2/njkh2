#include <stdio.h>
#include <unistd.h>
#include <windows.h>
#include <stdlib.h>
int main()
{
    int hr, min, sec;
    hr = min = sec = 0;
    int limit_hr, limit_min, limit_sec;
    printf(" ENTER THE LIMIT IN hr:min:sec format \n(ignore colons and seperate each term by space ) ");
    scanf("%d %d %d", &limit_hr, &limit_min, &limit_sec);
    while (1)
    {

        // cleare the screen for output
        // for windows use system("cls")
        system("cls");
        // print the time in hr:min:sec format
        printf(" %02d:%02d:%02d ", hr, min, sec);

        // to check whether the time is up or not
        if (limit_hr == hr && limit_min == min && limit_sec == sec)
        {
            printf("\n TIME UP ! ");
            Beep(500, 1000);
            exit(0);
        }
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
