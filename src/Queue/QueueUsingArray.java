package Queue;

public class QueueUsingArray {
    static int[] arr;
    static  int front,rear;
    int size;

    QueueUsingArray(int size)
    {
        arr= new int[size];
        front=-1;
        rear=-1;
        this.size=size;
    }

    public void enqueue(int data)
    {
        if(rear ==size-1)
            System.out.println("Queue full");
        else if (front== -1){
            front=0;}
        arr[++rear]= data;
    }

    public void dequeue()
    {
        if(front==-1)
            System.out.println("Queue empty");
        else
        {
            if(front>=rear) //reset queue if it only has one element
            {
                front=-1;
                rear=-1;
            }
            else
                front++;
        }
    }

    public static void printQueue()
    {
        for(int i=front;i<=rear;++i)
            System.out.println(arr[i]);
    }

    public static void main(String [] args)
    {
        QueueUsingArray queueUsingArray= new QueueUsingArray(5);
        queueUsingArray.enqueue(1);
        queueUsingArray.enqueue(2);
        queueUsingArray.enqueue(3);
        queueUsingArray.enqueue(4);
        queueUsingArray.enqueue(5);

        printQueue();

        queueUsingArray.dequeue();
        queueUsingArray.dequeue();

        printQueue();

    }

}
