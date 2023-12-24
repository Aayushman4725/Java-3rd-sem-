#include <stdio.h>
#include <ctype.h>
#include<string.h>

char stack[20];
int tos=-1;

void push(char x)
{
    stack[++tos]=x;
}

char pop()
{
    if(tos==-1)
    return -1;

    else
    return stack[tos--];
}

int priority(char x)
{
    if(x=='(')
    return 0;

    if(x=='+' || x=='-')
    return 1;

    if(x=='*'|| x=='/')
    return 2;
}

int main()
{
    char exp[20];
    char *e,x;

    printf("Enter expression:");
    gets(exp);
    strrev(exp);
    e=exp;

    while(*e!='\0')
    {
        if(isalnum(*e))
        printf("%c",*e);

        else if(*e==')')
        push(*e);

        else if(*e=='(')
        {
            while((x=pop('('))!=')')
            printf("%c",x);
        }

        else
        {
            while(priority(stack[tos])<=(priority(*e)))
            printf("%c",pop());
            push(*e);
        }
        e++;
    }

    while(tos!=-1)
    {
        char d=strrev(pop());
        printf("%c",d);
    }
}