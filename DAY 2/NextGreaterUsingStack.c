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
    int nextGreater;
    for(int i=a-1;i>=0;i--){
        if(isEmpty()){
            push(arr[i]);    //last ele is pushed
        }else if(peek() > arr[i] ){      // eleemnt in stack > traversing ele
            nextGreater = peek();
            push(arr[i]);
            arr[i] = nextGreater;
        }else{
            while(!isEmpty() && peek() <= arr[i]){
                pop();
            }
            if(isEmpty()){
                push(arr[i]);
            }
            else{
                nextGreater=peek();
                push(arr[i]);
                arr[i]=nextGreater;
            }
        }
    }
    for(int i=0;i<a;i++){
        printf("%d ",arr[i]);
    }
}
