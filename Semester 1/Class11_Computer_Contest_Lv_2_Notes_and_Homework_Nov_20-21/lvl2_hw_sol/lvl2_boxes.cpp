#include <iostream>
#include <algorithm>
using namespace std;
struct box{
    int l, w, h, volume;
}boxes[101], items[101];
int n, m, a[3];

bool cmp(box x, box y){
    return x.volume < y.volume;
}

int main(){
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> a[0] >> a[1] >> a[2];
        sort(a, a+3);
        boxes[i].l=a[0]; boxes[i].w=a[1]; boxes[i].h=a[2];
        boxes[i].volume = a[0]*a[1]*a[2];
    }
    sort(boxes, boxes+n, cmp);

    cin >> m;
    for(int i=0; i<m; i++){
        cin >> a[0] >> a[1] >> a[2];
        sort(a, a+3);
        items[i].l=a[0]; items[i].w=a[1]; items[i].h=a[2];
        items[i].volume = a[0]*a[1]*a[2];
    }

    for(int i=0; i<m; i++){
        bool output = false;
        for(int j=0; j<n; j++){
            if (items[i].l<=boxes[j].l && items[i].w<=boxes[j].w
                && items[i].h<=boxes[j].h){
                cout << boxes[j].volume << endl;
                output = true;
                break;
            }
        }
        if(!output)
            cout << "Item does not fit." << endl;
    }
    return 0;
}