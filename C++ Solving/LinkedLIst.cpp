#include <iostream>
using namespace std;

template <class T>
class Link
{
public:
    T data;
    Link<T> *next;
    Link(const T info, const Link<T> *nextValue = nullptr)
    {
        data = info;
        next = nextValue;
    }
};

template <class T>
class List
{
    void clear();   // 置空线性表
    bool isEmpty(); // 线性表为空时，返回 true
    void append(const T value);

    void insert(const int p, const T value);

    void deleteLIst(const int p);

    void getPos(int &p, const T value);

    void getValue(const int p, T &value);
};

template <class T>
class arrList : public List<T>
{                 // 顺序表，向量
private:          // 线性表的取值类型和取值空间
    T *aList;     // 私有变量，存储顺序表的实例
    int maxSize;  // 私有变量，顺序表实例的最大长度
    int curLen;   // 私有变量，顺序表实例的当前长度
    int position; // 私有变量，当前处理位置
public:
    arrList(const int size)
    { // 创建新表，设置表实例的最大长度
        maxSize = size;
        aList = new T[maxSize];
        curLen = position = 0;
    }
    ~arrList()
    { // 析构函数，用于消除该表实例
        delete[] aList;
    }
    void clear()
    { // 将顺序表存储的内容清除，成为空表
        delete[] aList;
        curLen = position = 0;
        aList = new T[maxSize];
    }
    int length();                              // 返回当前实际长度
    bool append(const T value);                // 在表尾添加元素 v
    bool insert(const int p, const T value);   // 插入元素
    bool deletePos(const int p);               // 删除位置 p 上元素
    bool setValue(const int p, const T value); // 设元素值
    bool getValue(const int p, T &value);      // 返回元素
    bool getPos(int &p, const T value);        // 查找元素
    void print();
};

template <class T>
bool arrList<T>::insert(const int p, const T value)
{
    int i;
    if (curLen >= maxSize)
    {
        cout << "The list is overflow" << endl;
        return false;
    }
    if (p < 0 || p > curLen)
    { // 检查插入位置是否合法
        cout << "Insertion point is illegal" << endl;
        return false;
    }
    for (i = curLen; i > p; i--)
        aList[i] = aList[i - 1]; // 从表尾 curLen -1 起往右移动直到 p
    aList[p] = value;            // 位置 p 处插入新元素
    curLen++;                    // 表的实际长度增 1
    return true;
}

template <class T> // 顺序表的元素类型为 T
bool arrList<T>::deletePos(const int p)
{
    int i;
    if (curLen <= 0)
    { // 检查顺序表是否为空
        cout << " No element to delete \n"
             << endl;
        return false;
    }
    if (p < 0 || p > curLen - 1)
    { // 检查删除位置是否合法
        cout << "deletion is illegal\n"
             << endl;
        return false;
    }
    for (i = p; i < curLen - 1; i++)
        aList[i] = aList[i + 1]; // 从位置p开始每个元素左移直到 curLen
    curLen--;                    // 表的实际长度减1
    return true;
}

template <class T>
int arrList<T>::length()
{
    return curLen;
}

template <class T>
bool arrList<T>::append(const T value)
{
    if (curLen >= maxSize)
    {
        cout << "The list is overflow" << endl;
        return false;
    }
    aList[curLen] = value;
    curLen++;
    return true;
}

template <class T>
bool arrList<T>::setValue(const int p, const T value)
{
    if (p < 0 || p > curLen)
    {
        cout << "value out of bounds\n"
             << endl;
        return false;
    }

    aList[p] = value;
    return true;
}

template <class T>
bool arrList<T>::getValue(const int p, T &value)
{
    if (p < 0 || p > curLen)
    {
        cout << "value out of bounds\n"
             << endl;
        return false;
    }
    value = aList[p];
    return true;
}

template <class T>
bool arrList<T>::getPos(int &p, const T value)
{
    for (int i = 0; i < curLen; i++)
    {
        if (aList[i] == value)
        {
            p = i;
            return true;
        }
    }
    cout << "value not found \n"
         << endl;
    return false;
}

template <class T>
void arrList<T>::print()
{
    for (int i = 0; i < curLen; i++)
    {
        cout << aList[i] << " ";
    }
}

int main()
{
    arrList<int> test(10);
    test.append(3);
    test.append(7);
    test.append(13);
    test.insert(2, 5);
    test.deletePos(3);
    test.append(6);
    int n;
    test.getPos(n, 7);
    cout << n << endl;
    test.setValue(2, 15);

    int m;
    test.getValue(20, m);
    cout << m << endl;
    test.print();
    return 0;
}