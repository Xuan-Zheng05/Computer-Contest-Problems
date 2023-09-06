#include <bits/stdc++.h>
using namespace std;
bool vis[200][401]; int curR = 0, curC = 0, len; char dir;
bool drill(char direction, int length){
    int dr = 0, dc = 0; bool safe = true;
    if(direction == 'u') dr = 1;
    if(direction == 'd') dr = -1;
    if(direction == 'l') dc = -1;
    if(direction == 'r') dc = 1;
    for(int i=0; i<length; i++) {
        curR += dr; curC += dc;
        if(vis[curR+200][curC+200]) safe = false;
        vis[curR+200][curC+200] = true;
    }
    return safe;
}
int main(){
    drill('d', 3); drill('r', 3); drill('d', 2); drill('r', 2); drill('u', 2); drill('r', 2);
    drill('d', 4); drill('l', 8); drill('u', 2);
    while(cin >> dir >> len && dir != 'q'){
        if(drill(dir, len)) cout << curC << " " << curR << " safe" << endl;
        else {
            cout << curC << " " << curR << " DANGER" << endl;
            break;
        }
    }
}