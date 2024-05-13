package question6;

import static question6.DeleteElementFromArray.deleteElement;

public class CheckDelete{


    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;

        System.out.println("Array before deletion:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int[] modifiedArray = deleteElement(array, indexToDelete);

        System.out.println("\nArray after deletion:");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }
}

