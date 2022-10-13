package bai1;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7, 2, 6};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arrInt) {
        for (int i = 1; i < arrInt.length-1; i++) {
            int indexmin = i;
            for (int j = i + 1; j < arrInt.length; j++) {
                if (arrInt[j] <  arrInt[indexmin]) {
                    indexmin = j;
                }
            }
            if (indexmin != i) {
                int temp=arrInt[indexmin];
                arrInt[indexmin]=arrInt[i];
                arrInt[i]=temp;
            }
        }
    }
}