#include <iostream>
#include <string>
#include <stdio.h>

using namespace std;

int main() {

    freopen("input.txt", "r", stdin);
    int n;
    cin >> n;
    char rooms[101][101];
    int readRooms[101][101];

    for (int i= 0; i < n; i++)
    {
        for (int j = 0;  j < n; j++) {
            cin >> rooms[i][j];
            readRooms[i][j] = 0;
        }
    }

    int m;
    cin >> m;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                   if (rooms[j][k] == '@' && readRooms[i] ) {

                   }
            }
        }
    }
    return 0;
}