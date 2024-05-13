package question5;

import static question5.QueueUsingStacks.mergeSort;

public class Check{


    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(23);
        queue.enqueue(8);
        queue.enqueue(10);

        int[] numbers = new int[3];
        int index = 0;
        while (!queue.isEmpty()) {
            numbers[index] = queue.dequeue();
            index++;
        }

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

