import java.util.Scanner;

public class ShanzenSortingCenter {

    public static void lowToHigh(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
           
             }
         }
     }

    public static void highToLow(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                 }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
          }
        System.out.println();
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
             arr[i] = scanner.nextInt();
        }

        System.out.println("Choose sorting order:");
        System.out.println("1. Low to High (Ascending)");
        System.out.println("2. High to Low (Descending)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            lowToHigh(arr);
            System.out.println("Sorted array (Low to High):");
        } else if (choice == 2) {
            highToLow(arr);
            System.out.println("Sorted array (High to Low):");
        } else {
            System.out.println("Invalid choice.");
            return;
        }
         printArray(arr);
     }
}
