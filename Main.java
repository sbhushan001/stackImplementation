package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
    }
}
//Implementation using array
class myStack<T>{
    private T arr[] = (T[]) new Object[100];
    private int tos = -1;
    void push(T data){
        if(isFull()) System.out.println("Stack is Full");
        else {
            tos += 1;
            arr[ tos ] = data;
        }
    }
    T pop(){
        if(isEmpty()) return null;
        else {
            T data = arr[ tos ];
            arr[ tos ] = null;
            tos -= 1;
            return data;
        }
    }
    T peek(){
        if(isEmpty()) return null;
        else return arr[tos];
    }
    boolean isEmpty(){
        if(tos==-1) return true;
        return false;
    }
    boolean isFull(){
        if(tos==arr.length-1) return true;
        return false;
    }
    void print(){
        for(int i=0;i<=tos;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}