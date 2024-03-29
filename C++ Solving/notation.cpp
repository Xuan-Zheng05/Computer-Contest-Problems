#include <iostream>
using namespace std;

double notation()
{
    char str[10];
    cin >> str;
    switch (str[0])
    {
    case '+':
        return notation() + notation();
    case '-':
        return notation() - notation();
    case '*':
        return notation() * notation();
    case '/':
        return notation() / notation();
    default:
        return atof(str);
    }
}

int main()
{
    freopen("input.txt", "r", stdin);
    cout << notation();
    return 0;
}