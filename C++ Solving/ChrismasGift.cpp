#include <iostream>
#include <string>
#include <algorithm>
#include <iomanip>
using namespace std;

struct Gift
{
    double amount;
    int weight;
    double optimized;
};

bool operator<(const Gift &a, const Gift &b)
{
    return a.optimized > b.optimized;
}
int main()
{
    freopen("input.txt", "r", stdin);
    int n, w;
    cin >> n >> w;
    Gift arr[101];
    for (int i = 0; i < n; i++)
    {
        double amount, optimized;
        int weight;
        cin >> amount >> weight;
        optimized = amount / weight;
        Gift temp = {amount, weight, optimized};
        arr[i] = temp;
    }
    sort(arr, arr + n);

    int totalWeight = 0;
    double totalAmount = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i].weight + totalWeight > w)
        {
            int remainder = w - totalWeight;
            double remAmount = arr[i].optimized * remainder;
            totalAmount += remAmount;
            break;
        }
        else
        {
            totalAmount += arr[i].amount;
            totalWeight += arr[i].weight;
        }
    }
    printf("%.1lf\n", totalAmount);
}