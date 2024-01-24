#include <iostream>
#include <cstring>

struct node
{
    bool end;
    node *children[11];
    int count = 0;
    ~node()
    {
        for (int i = 10; i >= 0; i--)
        {
            if (children[i])
            {
                delete children[i];
            }
        }
    }
    node()
    {
        end = false;
        for (int i = 0; i < 11; i++)
            children[i] = NULL;
    }
};
node *root;
bool yes = true;

void insert(char *str, int len)
{
    node *location = root;
    for (int i = 0; i < len; i++)
    {
        if (!yes)
            return;
        if (str[i] == 0 || str[i] == '\n')
            continue;
        int id = str[i] - '0';
        if (location->children[id] == NULL)
        {
            location->children[id] = new node;
        }
        if (location->end)
        {
            yes = false;
            return;
        }
        location = location->children[id];
        location->count++;
    }
    location->end = true;
    if (yes)
    {
        yes = location->count == 1;
    }
}
char str[20];
int main()
{
    freopen("input.txt", "r", stdin);
    int T;
    scanf("%d", &T);
    while (T--)
    {
        root = new node;
        yes = true;
        int n;
        scanf("%d", &n);
        while (n--)
        {
            scanf("%s", str);
            int len = strlen(str);
            insert(str, len);
        }
        printf("%s\n", yes ? "YES" : "NO");
        delete root;
    }
}