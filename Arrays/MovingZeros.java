public class MovingZeros {

    public static void moveZerosToRight(int[] arr) {
        int j = 0; // position for non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    


    public static void moveZerosToLeft(int[] arr) {
        int j = arr.length - 1; // position for non-zero

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZerosToRight(arr);
        System.out.print("Zero's Shifted to right: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        moveZerosToLeft(arr);
        System.out.print("Zero's shifted to left: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}