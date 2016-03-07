package arrayutils;

import java.util.Arrays;

/**
 * Created by Nikol on 3/5/2016.
 */
public class MyArray {
    private int[] data;

    public MyArray(int[] data) {
        this.data = data;
    }

    public int get(int index){
        return data[index];
    }

    public int change(int index, int value){
        return data[index] = value;
    }

    public void delete(int index){
        int[] newArray = new int[data.length - 1];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == index){
                continue;
            }
            newArray[j] = data[i];
            j++;
        }
        data = newArray;
    }

    public void add(int index, int value){
        int[] newArray = new int[data.length + 1];
        for (int i = 0; i < index ; i++) {
            newArray[i] = data[i];
        }
        newArray[index] = value;
        for (int i = index; i < data.length; i++) {
            newArray[i + 1] = data[i];
        }
        data = newArray;
    }

    public void add(int value){
        add(data.length, value);
    }

    public int size(){
        return data.length;
    }

    @Override
    public String toString() {
       return Arrays.toString(data);
    }
}
