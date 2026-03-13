import java.util.EmptyStackException;

public class StackLogic
{

    private int[] stackArray;
    private int top;

    public StackLogic()
    {
        stackArray = new int[10];
        top = -1;
    }
    public StackLogic(int maxSize)
    {
        stackArray = new int[maxSize];
        top = -1;
    }
    public int size()
    {
        return top+1;
    }
    public boolean isFull()
    {
        return (top==stackArray.length-1);
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    //push to stack
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }
        top=top+1;
        stackArray[top]=x;
    }
    //pop from stack
    public int pop()
    {
        int x;
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }
        x=stackArray[top];
        top=top-1;
        return x;
    }
    //peek from stack
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
    //display all
    public void display()
    {
        int i;

        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack is : ");
        for(i=top; i>=0; i--)
            System.out.println(stackArray[i] + " ");
        System.out.println();
    }

}
