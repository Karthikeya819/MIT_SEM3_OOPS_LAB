/*
Design a stack class. Provide your own stack exceptions namely Push Exception and 
Pop Exception, which throw exceptions when the stack is full and when the stack is 
empty respectively. Show the usage of these exceptions in handling a stack object in 
the main
*/

import java.util.*;

class PushException extends Exception{String toString(){return "Stack is Full!";}}
class PopException extends Exception{String toString(){return "Stack is Empty!";}}

class Stack{
    int Arr[];
    int tos,Capacity;
    Stack(int Capacity){
        this.Capacity = Capacity;
        Arr = new int[Capacity];
        tos = -1;
    }
    int pop() throws PopException{
        if(tos == -1){
            throw new PopException();
        }
        return Arr[tos--];
    }
    void push(int item) throws PushException{
        if(tos == Capacity-1){
            throw new PushException();
        }
        Arr[++tos] = item;
    }
}

class q1{
    public static void main(String args[]){
        Stack stack = new Stack(2);
        try{
            stack.push(10);
            stack.push(20);
            stack.push(20);
            int _ = stack.pop();
        }catch(PushException e){
            System.out.println(e);
        }catch(PopException e){
            System.out.println(e);
        }
    }
}