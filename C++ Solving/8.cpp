#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
char **split_string(char *text, char delim)
{
    assert(text != NULL);
    char **word = NULL;
    int counter = 0;
    char *substr = strtok(text, &delim);
    while (substr != NULL)
    {
        word = (char **)realloc(word, sizeof(char *) * (counter + 1));
        word[counter] = substr;
        counter++;
        printf("%s \n", substr);
        substr = strtok(NULL, "-");
    }
}
int main()
{
    char str[] = "Hello-World!";
    char *substr = strtok(str, "-");
    char **word = NULL;
    int counter = 0;
    while (substr != NULL)
    {
        word = (char **)realloc(word, sizeof(char *) * (counter + 1));
        word[counter] = substr;
        counter++;
        printf("%s \n", substr);
        substr = strtok(NULL, "-");
    }
    return 0;
}