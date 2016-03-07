package livecoding.lab22;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


/**
 * Created by Nikol on 3/6/2016.
 */
public class MirrorTest {
    @Test
    public void testUpDown_WhenSizeIs0(){
    // given
        Mirror mirror = new Mirror();
        int[][] array = new int[0][0];
    //when
        mirror.upDown(array);
    //then
        assertEquals("", toString(array));

}

    private String toString(int[][] array) {
        String result = "";
        int size = array.length;
        for (int y = 0; y < size; y++) {
            int [] row = array[y];
            if (row.length != size){
                fail("Array is not square!");
            }
            for (int x= 0; x < size; x++) {
                result += array[y][x];
            }
            result +="\n";
        }
        return result;
    }

    @Test
    public void testUpDown_WhenSizeIs1(){
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[1][1];
        array[0][0] = 13;

        //when
        mirror.upDown(array);
        //then
        assertEquals("13\n", toString(array));
    }

    @Test
    public void testUpDown_WhenSizeIs2(){
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];
        //1 2
        //3 4
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        assertEquals(
                    "12\n" +
                    "34\n"    , toString(array));

        //when
        mirror.upDown(array);
        //then
        assertEquals(
                    "34\n" +
                    "12\n"    , toString(array));
    }

    @Test
    public void testUpDown_WhenSizeIs3(){
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];
        //1 2 3
        //4 5 6
        //7 8 9
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        assertEquals(
                    "123\n" +
                    "456\n" +
                    "789\n", toString(array));

        //when
        mirror.upDown(array);
        //then
        assertEquals(
                    "789\n" +
                    "456\n" +
                    "123\n", toString(array));
    }

    public void test2(){
        // given

        //when

        //then

    }
    public void test3(){
        // given

        //when

        //then

    }
    public void test4(){
        // given

        //when

        //then

    }
    public void test5(){
        // given

        //when

        //then

    }
    public void test6(){
        // given

        //when

        //then

    }
}

