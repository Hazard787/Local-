import java.util.Scanner;
import java.util.Arrays;

class deleteArray {

    static int delete(int[] arr, int size, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return size;
        } else {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
        return size - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element for index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before deletion:\n" + Arrays.toString(arr));
        System.out.println("1) Delete number from an index\n2) Delete by value");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter index:");
                int index = sc.nextInt();
                int len1 = delete(arr, size, index);
                System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, len1)));
                System.out.println("New size is " + len1);
                break;

            case 2:
                System.out.println("Enter number to delete");
                int num = sc.nextInt();
                int index2 = -1;
                for (int i = 0; i < size; i++) {
                    if (num == arr[i]) {
                        index2 = i;
                        break;
                    }
                }
                if (index2 == -1) {
                    System.out.println("Number not found!");
                } else {
                    int len = delete(arr, size, index2);
                    System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, len)));
                    System.out.println("New size is " + len);
                }
                break;

            default:
                System.out.println("❌ Invalid choice! Please enter only 1 or 2.");
        }

        sc.close();
    }
}
