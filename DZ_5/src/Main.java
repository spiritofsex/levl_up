import static java.lang.System.out;

/**
 * Created by bereznoy on 21.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Вывести на экран возрастающую последовательность из 10 чисел начиная с 15.

        int x = 15;
        for (int i = 0; i < 10; i++) {
            x += 1;
            System.out.print(x + " , ");
        }
        System.out.print("\n");
        //Вывести на экран убывающую последовательность нечетных чисел в интервале от 33 до 15.
        int y = 33;
        for (int i = 33; i > 15; i--) {
            y -= 1;
            int w = y % 2;
            if (w == 1) {
                System.out.print(y + " , ");
            }
        }

        System.out.print("\n");
        int[] element = {15, 20, 31, 19, 18, 17, 16, 21, 22, 23, 10, 30, 29, 28};
        int[] myElement = {1, 2, 5};

        notRevers(element);
        System.out.print("\n");
        revers(element);
        System.out.print("\n");
        int[] element3 = new int[20];
        mas(element3);
        mas1(element);
        mas2(myElement);


    }

    // Написать программу для вывода на экран всех элементов массива строк через запятую.
    public static void notRevers(int[] element) {

        for (int i = 0; i < element.length; i++) {

            System.out.print(element[i] + " , ");
        }
    }
    //  Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.

    public static void revers(int[] element) {

        for (int i = element.length - 1; i >= 0; i--) {

            System.out.print(element[i] + " , ");
        }
    }

    //Написать программу для заполнения 20 элементов массива чисел с шагом 3, первым элементом которого будет 5.
    public static void mas(int[] element3) {

        for (int i = 4; i <= element3.length; i += 3) {
            element3[i] = 5;
            System.out.println(element3[i]);
        }
    }

    //Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.
    public static void mas1(int[] element) {
        int sum = 0;
        for (int i = 0; i <= element.length; i += 3) {
            sum = sum + element[i];
        }

        int sum1 = sum % 2;
        boolean sum2 = (sum1 == 0) ? true : false;
        System.out.println("Число четное? = " + sum2);

    }

    //    Дан массив чисел. Используя тернарный оператор определить:
;





    //    а) максимальный элемент
    public static void mas2(int[] myElement) {
        int sum = 0;
        int max = myElement[0];
        for (int i = 0; i < myElement.length; i++) {
            sum = max < myElement[i] ? max = myElement[i] : max;
        }
        System.out.println("Максимальный элемент = " + sum);

        //    б) минимальный элемен
        int min = myElement[0];
        for (int i = 0; i < myElement.length; i++) {
            sum = min > myElement[i] ? min = myElement[i] : min;
        }
        System.out.println("Минимальный элемент = " + sum);


        //    в) на сколько максимальный элемент больше минимального;

        int sun1 = max != min ? max - min : 0;
        System.out.println("максимальный элемент больше минимального = " + sun1);

        //г)  индекс максимального элемента;
        int index = 0;
        for (int i = 0; i < myElement.length; i++)
        {
            sum = max ==myElement[i] ? index = i: max;
        }
        System.out.println("максимальный элемент больше минимального = " + sum);

        
//    д) индекс минимального и индекс максимального элементов.

        int indexMinimum = 0;
        int sumMax = 0;
        for (int i = 0; i < myElement.length; i++)
        {
            sum = min == myElement[i] ? indexMinimum = i: min -1;
            sumMax = max == myElement[i] ? index = i: max;
        }
        System.out.println("максимальныий индекс  = " + sumMax);
        System.out.println("минимальный̆ индекс = " + sum);
    }


}