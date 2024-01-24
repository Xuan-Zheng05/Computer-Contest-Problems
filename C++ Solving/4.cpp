#include <iostream>
#include <string>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    int year, month, day;
    scanf("%d-%d-%d", &year, &month, &day);

    if (day > 0 && day < 28)
    {
        day += 1;
    }
    else if (day == 28)
    {
        if (month == 2)
        {
            if ((year % 100 == 0 && year % 400 == 0) || year % 400 == 0)
            {
                day = 29;
            }
            else
            {
                day = 1;
                month = 3;
            }
        }
        else
        {
            day += 1;
        }
    }
    else if (day == 29)
    {
        if (month == 2)
        {
            day = 1;
            month = 3;
        }
        else
        {
            day += 1;
        }
    }
    else if (day == 30)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            day += 1;
        }
        else
        {
            day = 1;
            month += 1;
        }
    }
    else if (day == 31)
    {
        day = 1;
        if (month == 12)
        {
            year += 1;
            month = 1;
        }
        else
        {
            month += 1;
        }
    }

    cout << year << "-";
    if (month < 10)
    {
        cout << "0" << month << "-";
    }
    else
    {
        cout << month << "-";
    }
    if (day < 10)
    {
        cout << "0" << day;
    }
    else
    {
        cout << day;
    }
    return 0;
}