package question3;

public class QueueCheck{
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
    }
}

}
