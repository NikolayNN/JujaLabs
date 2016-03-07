package livecoding.lab22;

/**
 * Created by Nikol on 3/6/2016.
 */
public class Mirror {
    public static void main(String[] args) {

    }

    public int[][] upDown(int[][] array) {
        int size = array.length;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size / 2; y++) {
                int temp = array[y][x];
                array[y][x] = array[size - y - 1][x];
                array[size - y - 1][x] = temp;
            }
        }
        return array;
    }
}
