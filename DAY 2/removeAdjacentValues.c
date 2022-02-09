#include<stdio.h>
#include<stdlib.h>
int stack[100000];
int top=-1;
void push(int a){
    stack[++top]=a;
}
int pop(){
    return stack[top--];
}
int isEmpty(){
    return top==-1;
}
int peek(){
    return stack[top];
}
int main()
{
    int a;
    scanf("%d",&a);
    int arr[a];
    for(int i=0;i<a;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=a-1;i>=0;i--){
        if(isEmpty() || peek() != arr[i]){
            push(arr[i]);
        }
        else{
            pop();
        }
    }
    if(isEmpty()){
        printf("-1");
        return;
    }
    while(!isEmpty()){
        printf("%d ",pop());
    }
}

