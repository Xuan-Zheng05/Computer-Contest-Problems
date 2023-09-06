#include <iostream>
#include <string>
using namespace std;
int main()
{
    int k;
    string message;
    cin >> k >> message;
    for (int i=0; i< message.length(); i++){
        int decode = message[i] - 3*(i+1) - k;
        if(decode < 'A')
            decode += 26;
        message[i] = decode;
    }
    cout << message << endl;
    return 0;
}
