package sorting;

import java.util.Arrays;

public class SorterTest {
    public static void main (String[] args) {
        int[] li = {0,6,5,4,3,2,1,6,4,7,8,2,8,9,2,8,9,10,-1};
        System.out.println(Arrays.toString(li));
        MainProgram.sort(li);
        System.out.println(Arrays.toString(li));
    }
}
