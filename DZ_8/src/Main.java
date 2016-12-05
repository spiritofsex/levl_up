import java.util.Arrays;
/**
 * Created by bereznoy on 30.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] number = {5, 8, 33, 8, 33, 33, 3};
        arithmeticMeanEach(number);
        arithmeticMeanWhile(number);
        arithmeticMeanEach1(number, 10);
        arithmeticMeanWhile1(number, 10);
        int[] arr = {2, 4, 5, 3, 4, 4, 5, 2, 5, 6, 7, 7, 8, 8, 9, 12, 12, 15, 16, 20};
        twentyElements(arr);
        int[] speed = new int[40];
        int i = 0;
        while (i < speed.length) {
            speed[i] = 160 + (int) (Math.random() * ((280 - 160) + 1));
            i++;
        }
        carSpeed(speed);
        int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        sequenceNumber(sequence);
        double[] negativeArr = {-2.5, -1.5, -0.8, -0.3, 1.1, 2.2};
        negativeNumbers(negativeArr);
        naturalNumbers(1255555555);
        mirrorNumber(45634);
        program(12);
        ratingStudent(100);
        int a =0;

    }

    //    1.    Найти среднее арифметическое элементов массива, больших числа 10.
//      * Решить задачу при помощи циклов while и for-each
    public static void arithmeticMeanEach(int[] number) {
        int result = 0;
        int count = 0;
        for (int s : number) {
            if (s > 10) {
                result += s;
                count++;
            }
        }
        int result1 = result / count;
        System.out.println(result1);
    }
    public static void arithmeticMeanWhile(int[] number) {
        int counter = 0;
        int result = 0;
        int count = 0;
        while (counter < number.length) {
            if (number[counter] > 10) {
                count++;
                result += number[counter];
            }
            counter++;
        }
        int result1 = result / count;
        System.out.println(result1);
    }
//  2.      Найти среднее арифметическое элементов массива, меньших некоторого числа m.
//          * Решить задачу при помощи циклов while и for-each
    public static void arithmeticMeanEach1(int[] number, int m) {
        int result = 0;
        int count = 0;
        for (int s : number) {
            if (s < m) {
                result += s;
                count++;
            }
        }
        int result1 = result / count;
        System.out.println(result1);
    }
    public static void arithmeticMeanWhile1(int[] number, int m) {
        int counter = 0;
        int result = 0;
        int count = 0;
        while (counter < number.length) {
            if (number[counter] < m) {
                count++;
                result += number[counter];
            }
            counter++;
        }
        int result1 = result / count;
        System.out.println(result1);
    }
    // 3.   В массиве из 20 элементов числа образуют неубывающую последовательность.
//    Несколько элементов, идущих подряд, равны между собой.
//    Найти количество таких элементов. Сколько различных чисел имеется в массиве?
    public static void twentyElements(int[] arr) {
        int number = 0;
        int res = 0;
        int numeric = 0;
        Arrays.sort(arr);
        for (int num : arr) {
            if (numeric == num)
                number++;
            else
                res++;
            numeric = num;
        }
        int result = res - number;
        System.out.println(result + " Элементов равных между собой " + res + " различных чисел");
    }
    // 4.   В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилеи
//    ̆. Определить скорости двух самых быстрых автомобилей. *
//    Задачу решить, не используя два прохода по массиву.
    public static void carSpeed(int[] speed) {
        Arrays.sort(speed);
        int max = speed[0];
        int max2 = speed[0];
        int j = 0;
        System.out.println(Arrays.toString(speed));
        while (j < speed.length) {
            if (max < speed[j]) {
                max = speed[j];
                max2 = speed[j - 1];
            }
            j++;
        }
        System.out.println("Два самы быстрых авто едут со скоростью " + max2 + " и " + max);
    }
    // 5.   Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
//    а) сумму всех чисел последовательности;
//    б) количество всех чисел последовательности.
    public static void sequenceNumber(int[] sequence) {
        int result = 0;
        int result1 = 0;
        for (int s : sequence) {
            result += s;
            if (s >= 0) result1++;
        }
        System.out.println("Сумма чисел " + result + " Количество " + result1);
    }
    //6.    Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа.
//    Определить, какое количество отрицательных чисел записано в начале последовательности.
//    Условный оператор не использовать.
    public static void negativeNumbers(double[] negativeArr) {
        int i = 0;
        while (negativeArr[i] < 0) {
            i++;
        }
        System.out.println("Количество отрицательных чисел = " + i);
    }
    //7.    Дано натуральное число.
//    Определить, сколько раз в нем встречается максимальная цифра (например, для числа 132233 ответ равен 3,
//    для числа 46 336 — 2, для числа 12 345 — 1). * Задачу решить, не используя два прохода по массиву.
    public static void naturalNumbers(int positive) {
        int rest = 0;
        int count = 0;
        int result = 0;
        while (true) {
            rest = positive%10;
            if (count == rest)
                result++;
            else if (count < rest) {
                count = rest;
                result = 1;
            }
            positive/=10;
                if(rest == 0)break;
        }
        System.out.println(result + " Повторяющихся значений");
    }
// 8.    Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа.
public static void mirrorNumber (int sum ) {
    int rest = 0;
    int result = 0;
    while (sum>0){
        rest = sum%10;
        result = rest;
        sum/=10;
        System.out.print(result);
    }
    System.out.println();
}//   9. Дано двузначное число.
//    Необходимо написать программу, которая вернет строковое представление данного числа.
//    Например, дано число 34, его строковое представление - thirty four.
public static void program (int lineInNumber ) {
    int rest = lineInNumber;
    int whole = lineInNumber;
    if(lineInNumber/10 > 1) {
        whole = lineInNumber / 10 * 10;
        rest = lineInNumber%10;
        System.out.println(rest);
    }
    switch (whole) {
        case 20:
            System.out.print("twenty ");
            break;
        case 30:
            System.out.print("thirty ");
            break;
        case 40:
            System.out.print("forty ");
            break;
        case 50:
            System.out.print("fifty ");
            break;
        case 60:
            System.out.print("sixty ");
            break;
        case 70:
            System.out.print("seventy ");
            break;
        case 80:
            System.out.print("eighty ");
            break;
        case 90:
            System.out.print("ninety ");
            break;
    }
    switch (rest) {
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        case 4:
            System.out.println("four");
            break;
        case 5:
            System.out.println("five");
            break;
        case 6:
            System.out.println("six");
            break;
        case 7:
            System.out.println("seven");
            break;
        case 8:
            System.out.println("eight");
            break;
        case 9:
            System.out.println("nine");
            break;
        case 10:
            System.out.println("ten");
            break;
        case 11:
            System.out.println("eleven");
            break;
        case 12:
            System.out.println("Twelve");
            break;
        case 13:
            System.out.println("Thirteen");
            break;
        case 14:
            System.out.println("fourteen");
            break;
        case 15:
            System.out.println("fifteen");
            break;
        case 16:
            System.out.println("sixteen");
            break;
        case 17:
            System.out.println("seventeen");
            break;
        case 18:
            System.out.println("eighteen");
            break;
        case 19:
            System.out.println("nineteen");
            break;
    }
 }
//1.    Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
    public static void ratingStudent (int rating ) {
        String score = "";
        if (rating < 20) score = "F";
         else if (rating >=20 && rating < 40)score = "E";
         else if (rating >=40 && rating < 60) score = "D";
         else if (rating >=60 && rating < 75) score = "C";
         else if (rating >=75 && rating < 90) score = "B";
         else if (rating >=90 && rating <= 100)score = "A";
        if (rating < 0 || rating > 100) System.out.println("в ведите значение от 0 до 100");
        else System.out.println("Оценка студента с рейтингом " + rating + " = " + score);
    }
}









