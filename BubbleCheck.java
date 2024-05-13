package question4;

import static question4.BubbleSortAlphabets.bubbleSort;

public class BubbleCheck{
    public static void main(String[] args) {
        char[] alphabets = {'b', 'a', 'c', 'e', 'd'};
        System.out.println("Array before sorting:");
        for (char c : alphabets) {
            System.out.print(c + " ");
        }
        bubbleSort(alphabets);
        System.out.println("\nArray after sorting:");
        for (char c : alphabets) {
            System.out.print(c + " ");
        }
        }

    }
