#include <iostream>
using namespace std;

typedef struct HNode
{
    int weight;
    HNode *lchild, *rchild;
} *Htree;
Htree createHuffmanTree(int arr[], int n)
{
    Htree forest[n];
    Htree root = NULL;
    for (int i = 0; i < n; i++)
    { // 将所有点存入森林
        Htree temp;
        temp = (Htree)malloc(sizeof(HNode));
        temp->weight = arr[i];
        temp->lchild = temp->rchild = NULL;
        forest[i] = temp;
    }
    for (int i = 1; i < n; i++)
    {
        int minn = 0, minnSub = 0;

        for (int j = minnSub; j < n; j++)
        {
            if (forest[j] != NULL)
            {
                if (forest[j]->weight < forest[minn]->weight)
                {
                    minnSub = minn;
                    minn = j;
                }
                else if (forest[j]->weight < forest[minnSub]->weight)
                {
                    minnSub = j;
                }
            }
        }
        root = (Htree)malloc(sizeof(HNode));
        root->weight = forest[minn]->weight + forest[minnSub]->weight;
        root->lchild = forest[minn];
        root->rchild = forest[minnSub];
        forest[minn] = root;
        forest[minnSub] = NULL;
    }
    return root;
}

int main()
{
}