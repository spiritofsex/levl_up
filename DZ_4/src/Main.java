import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bereznoy on 16.11.2016.
 */
public class Main {
    public static void main (String[] args) {
        //    Объявите пустой массив с идентификатором arr.
        int[] arr;
//        Объявите массив byte с идентификатором byteArray на 26 элементов.
        byte[] byteArr = new byte[26];
//        Объявите массив строк с идентификатором stringArray на 10 элементов.

        String[] stringArray = new String[10];

//        Объявите массив строк с идентификатором daysOfWeek  и проинициализируйте его названиями дней недели.


        String[] daysOfWeek = {"Понедельник","Вторник","Среда","Четверг","Пятница","Субота","Воскресенье"};

//        Составить программу вывода на экран любого элемента массива по его индексу.

        System.out.println("Сегодня " + daysOfWeek[2]);

        /*Заполнить массив из восьми элементов следующими значениями:
         первый элемент массива равен 37, второй — 0, третий — 50, четвертый — 46,
          пятый — 34, шестой — 46, седьмой — 0, восьмой —13.
*/

        int [] element = new int[8];
        element[0] = 37;
        element[1] = 0;
        element[2] = 50;
        element[3] = 46;
        element[4] = 34;
        element[5] = 46;
        element[6] = 0;
        element[7] = 13;
 //       Заполнить массив из восьми элементов таким образом, чтобы значения элементов при просмотре массива слева направо образовывали:
 //       а) убывающую последовательность;


        int [] element1 = new int[8];
        element1[0] = 8;
        element1[1] = 7;
        element1[2] = 6;
        element1[3] = 5;
        element1[4] = 4;
        element1[5] = 3;
        element1[6] = 2;
        element1[7] = 1;
        System.out.println(Arrays.toString(element1));

        Arrays.sort(element1);

        //        б) возрастающую последовательность.

        System.out.println(Arrays.toString(element1));
       /* Дан массив целых чисел. Выяснить:
        а) является ли s-й элемент массива положительным числом;
        б) является ли k-й элемент массива четным числом;
        в) какой элемент массива больше: k-й или s-*/


        int[] number = {1,20,22,6,4};
        boolean s = number[1]>0;
        System.out.println("Число положительное? = " + s);
        int res = number[2]%2;
        boolean res1  = (res == 0) ? true : false;
        System.out.println("Число по индексу 2 четное? = " + res1);

        boolean res2  = (number[1] > number[2]) ? true : false;
        System.out.println("Число " + number[1] + " больше числа" + number[2] + " ? = " + res2);


        /*Дан двумерный массив.
                а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
                б) Вывести на экран элемент, расположенный в левом нижнем углу массива.*/

        int[][] sum = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Число в правом верхнем углу = " + sum[0][2]);
        System.out.println("Число в левом нижнем углу = " + sum[2][0]);
       /* Дан двумерный массив.
                а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
                б) Вывести на экран элемент, расположенный в левом верхнем углу массива.*/

        System.out.println("Число в правом нижнем углу = " + sum[2][2]);
        System.out.println("Число в левом верхнем углу = " + sum[0][0]);
/*        Дан двумерный массив. Составить программу:
        а) вывода на экран любого элемента второй строки массива;
        б) вывода на экран любого элемента массива.*/

        int[][] sum1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Число второй строки = " + sum1[1][1]);
        System.out.println("любой елемент масива  = " + sum1[2][1]);



    }
}