package question3;

import question2.Stack;

import java.util.ArrayDeque;
import java.util.EmptyStackException;

public static class QueueUsingStacks{
    private Stack stack1;
    private Stack stack2;

    public QueueUsingStacks(int maxSize) {
        stack1 = new Stack(maxSize);
        stack2 = new Stack(maxSize);
    }
    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        System.out.println(value + " enqueued to the queue");
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            throw new EmptyStackException();
        }
        int value = stack1.pop();
        System.out.println(value + " dequeued from the queue");
        return value;
    }

    public int peek() {
        if (stack1.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack1.peek();
    }

