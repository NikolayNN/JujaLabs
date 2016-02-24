import java.util.Arrays;
import java.util.Random;

/**
 * Created by Nikol on 2/7/2016.
 */
public class InsertionSorter {

    public static void main(String[] args) {
        int[] array = {1,5,9,6,7};
        sort(array);


//        for (int i : array) {
//            System.out.println(i);
//        }
//        System.out.println(Arrays.binarySearch(array, 5));

    }

//    public static void main(String[] args) {
//        int[] array = new int[256 * 1024];
//        Random rnd = new Random(0);
//        for (int k = 0; k < array.length; k++) {
//            array[k] = rnd.nextInt();
//        }
//        long t1 = System.nanoTime();
//        InsertionSorter.sort(array);
//        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);
//    }

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }


//    public static void sort(int[] arr) {
//
//        for (int k = 1; k < arr.length; k++) {
//            int newElement = arr[k];
//            int location = k - 1;
////            while (location >= 0 && arr[location] > newElement) {
////                arr[location + 1] = arr[location];
////                location--;
////            }
//            if (arr[location] > newElement) {
//
//                int newIdxLocation = 1 + Arrays.binarySearch(arr, 0, location, newElement);
//                arr[newIdxLocation] =
//
//            }
//
//            arr[location + 1] = newElement;
//        }
//    }
}