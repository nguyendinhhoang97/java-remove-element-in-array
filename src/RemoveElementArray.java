import java.util.Scanner;

public class RemoveElementArray {
    public static void main(String[] args) {

        //Declare the variables needed
        int[] oldArray;
        int number;
        int[] newArray;
        int sizeArray;
        Scanner scanner = new Scanner(System.in);

        //Allow users input element for array from keyboards
        System.out.println("Enter size for array: ");
        sizeArray = scanner.nextInt();
        oldArray = new int[sizeArray];
        newArray = new int[sizeArray - 1];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            oldArray[i] = scanner.nextInt();
        }

        //Allow users input value is needed remove
        boolean check = true;
        while (check) {
            System.out.println("Enter the number you want to remove: ");
            number = scanner.nextInt();

            //Check whether the number to be removed is in the array
            for (int i = 0; i < sizeArray; i++) {
                if (oldArray[i] == number) {
                    System.out.println("Have number " + number + " in array! It's location " + (i + 1));
                    check = false;
                    //Remove chose number
                    for (int j = 0; j < i; j++) {
                        newArray[j] = oldArray[j];
                    }
                    for (int k = i; k < newArray.length; k++) {
                        newArray[k] = oldArray[k + 1];
                    }
                }
            }
            if (check)
            System.out.println("Haven't number " + number + " in array! Please enter again!");
        }
        //Print new array
        if (newArray.length == 0) {
            System.out.println("Null");
        }else
            System.out.println("New array after removed element: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
