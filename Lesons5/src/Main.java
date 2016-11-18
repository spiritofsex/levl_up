import java.util.Arrays;

/**
 * Created by bereznoy on 18.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {

            int sqrt = i * i;
            int res = sqrt * i;
            System.out.println(sqrt + " " + res);

        }

        int[] arr = {1,2,3,4,5,6,7,8};
        modArray(arr);

    }

    static int[] modArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);

        }
        return arr;

    }
}