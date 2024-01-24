#include <iostream>
#include <stdio.h>
#include <memory.h>
using namespace std;

#define MAXIN 75

char board[MAXIN + 2][MAXIN + 2];
bool gone[MAXIN + 2][MAXIN + 2];

int width, height, minstep;
int beginX, beginY, endX, endY;

void Search(int currX, int currY, int direction, int count)
{
    if (count >= minstep)
    {
        return;
    }
    int nextX = currX, nextY = currY;
    if (direction == 1)
    {
        nextX = currX + 1;
    }
    if (direction == 2)
    {
        nextX = currX - 1;
    }
    if (direction == 3)
    {
        nextY = currY + 1;
    }
    if (direction == 4)
    {
        nextY = currY - 1;
    }

    if (nextX == endX && nextY == endY)
    {
        if (minstep > count)
        {
            minstep = count;
        }
        return;
    }
    if (board[nextY][nextX] == 'X' || nextX < 0 || nextY < 0 || nextX > width + 1 || nextY > height + 1 || gone[nextY][nextX] == true)
    {
        if (direction != 0)
            return;
    }

    for (int i = 1; i <= 4; i++)
    {
        gone[nextY][nextX] = true;
        if (direction == i)
        {

            Search(nextX, nextY, i, count);
        }
        else
        {
            Search(nextX, nextY, i, count + 1);
        }
        gone[nextY][nextX] = false;
    }
}

int main()
{
    freopen("input.txt", "r", stdin);
    int boardNum = 0;
    while (cin >> width >> height)
    {
        if (width == 0 && height == 0)
        {
            break;
        }

        boardNum++;
        cout << "Board #" << boardNum << endl;

        for (int i = 0; i < MAXIN + 2; i++)
        {
            for (int j = 0; j < MAXIN + 2; j++)
            {
                board[i][j] = ' ';
                gone[i][j] = false;
            }
        }

        for (int i = 1; i <= height; i++)
        {
            getchar();
            for (int j = 1; j <= width; j++)
            {
                board[i][j] = getchar();
            }
        }
        int count = 0;
        while (cin >> beginX >> beginY >> endX >> endY)
        {
            if (beginX == 0 && beginY == 0)
            {
                break;
            }
            count++;
            minstep = 100000;

            Search(beginX, beginY, 0, 0);
            if (minstep < 100000)
            {
                cout << "Pair " << count << ": " << minstep << " segments" << endl;
            }
            else
            {
                cout << "Pair " << count << ": "
                     << "impossible" << endl;
            }
        }
    }
}
