package arrayutils;

/**
 * Created by Nikol on 3/6/2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        MyArray myArray = new MyArray(array);
        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(" " + myArray.get(i));
        }
        myArray.add(5, 999);
        System.out.println();
        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(" " + myArray.get(i));
        }
        System.out.println();
        System.out.println(myArray.toString());
        myArray.add(666);
        System.out.println(myArray.toString());


    }
}
