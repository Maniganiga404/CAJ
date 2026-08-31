package lab3_2;

public class Stack {
    int[] stack;
    int top;

    void createNew(int n){
        stack = new int[n];
        top = -1;
    }

    boolean empty(){
        return top == -1;
    }

    void push(int value){
        if(top == stack.length - 1){
            System.out.println("stack Overflow");
        }
        else {
            top++;
            stack[top] = value;
        }
    }

    int pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            int value = stack[top];
            top--;
            return value;
        }
    }

    void display(){
        for(int i = top; i >=0; i--){
            System.out.println(stack[i]);
        }
    }
}

