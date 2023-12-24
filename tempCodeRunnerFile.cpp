#include <iostream>
#include <ctype.h>
using namespace std;

char stack[20];
int tos=-1;

void push(char x)
{
    stack[++tos]=x;
}

char pop(char x)
{
    if(tos==-1)
    {
        return -1;
    }

    else
    {
        return stack[tos--];
    }
}

int priority(char x)
{
    if(x=='(')
    {
        return 0;
    }

    else if(x=='+' || x=='-')
    return 1;

    else if(x=='*' || x=='/')
    {
        return 2;
    }
}

int main()
{
    char exp[20];
    char *e,x;

    cout<<"Enter expression:";
    cin>>exp;
    e=exp;

    while(*e!='\0')
    {
        if(isalnum(*e))
        cout<<*e;

        else if(*e=='(')
        push(*e);

        else if(*e==')')
        {
            while((x=pop(')'))!='(')
            {
                cout<<x;
            }
        }

        else
        {
            while(priority(stack[tos]>=priority(*e)))
            {
                cout<<pop();
               
            }
             push(*e);
        }
        e++;
    }

    while(tos!=-1)
    {
        cout<<pop();
    }
}