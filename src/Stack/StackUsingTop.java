package Stack;

import java.io.IOException;

public class StackUsingTop {

    int top=-1;
    int[] arr;
    int capacity;

    public StackUsingTop(int size)
    {
        arr= new int[size];
        capacity=size;
    }

    public void push(int data)
    {
        if(top== capacity-1)
            System.out.println("Stack full");
        arr[++top]= data;
        System.out.println("Element "+data +" added");
    }

    public void pop()
    {
        if(top==-1)
            System.out.println("Stack empty");
        top--;
    }

    public void printStack()
    {
        if(top==-1)
            System.out.println("Stack empty");
        for(int i=0;i<=top;++i)
            System.out.println(arr[i]);
    }

    public static void main(String[]args)throws IOException
    {
        int size= 5;
        StackUsingTop stackUsingTop= new StackUsingTop(size);
        stackUsingTop.push(1);
        stackUsingTop.push(2);
        stackUsingTop.push(3);
        stackUsingTop.push(4);

        stackUsingTop.pop();
        stackUsingTop.pop();

        stackUsingTop.printStack();
    }
}

//Output- 123 after pop