import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.sort;
import static java.util.Collections.swap;

public class Main {

    public static void main(String[] args) {
        int[] array = {8,9,10,7,6,5,4,3,2,1};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(Arrays.binarySearch(array, 5));

    }

//    static int binarySearch(int[] array, int x) {
//        int low = 0;
//        int high = array.length - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            int midVal = array[mid];
//            if (midVal < x)
//                low = mid + 1;
//            else if (midVal > x)
//                high = mid - 1;
//            else
//                return mid;
//        }
//        return -1;
//    }



        public static void sort(int[] arr) {

            for (int barrier = 0; barrier < arr.length - 1; barrier++) {
                int min = arr[barrier];
                int minIdx = barrier;
                for (int index = barrier + 1; index < arr.length; index++) {

                    if (min > arr[index]) {
                      min = arr[index];
                      minIdx = index;
                    }
                }
                int tmp = arr[barrier];
                arr[barrier] = arr[minIdx];
                arr[minIdx] = tmp;
            }
        }



    }





