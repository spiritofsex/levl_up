import java.util.Scanner;

/**
 * Created by bereznoy on 23.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        String word = "СловоДа";
        System.out.println(myWord(word));

        myClub("Днепр");

        int sum = 50;
        System.out.println(mySum(sum));


        String[] arr = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябырь", "Декабрь"};
        myAccount(1000, arr);
        envelope(10, 20, 9, 19);

        float x = 10;
        float y = 20;

        System.out.println(substance(x, y));

        env(6, 6);


        mas();



        courseCurrency();


        unicellularAmoeba (1);

        int[] rating = {1,2,3,4,5,5,5,5,3,2,4,5,2,1,4,3,5,4,3,2,5,5};
        masNumber1 (rating);
        int[] number = {11,12,13,14,15,16,17,25};
        masNumber (number);




    }

    //1. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
    public static String myWord(String word) {
        int num = word.length();
        for (int i = 0; i < num; i++) {
            word = "*" + word + "*";
        }
        return word;
    }

    //2. Дано название футбольного клуба. Напечатать его на экране "столбиком".
    public static void myClub(String club) {
        int num = club.length();
        for (int i = 0; i < num; i++) {
            System.out.println(club.charAt(i));
        }

    }

    // 3.   Найти сумму положительных нечетных чисел, меньших 50.
    public static int mySum(int sum) {
        int sum1 = 0;
        for (int i = 0; i <= sum; i++) {
            if (i % 2 == 1) sum1 += i;
        }
        return sum1;
    }
//   4. Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
//    а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
//    б) сумму вклада через: полгода, 2 года, 5 лет.

    public static void myAccount(float account, String[] arr) {
        float account3 = account;
        float account4 = account;
        float account5 = 0;
        float account6 = 0;
        float account7 = 0;
        float account8 = account;
        for (int i = 0; i <= 11; i++) {
            if (i > 1 && i <= 11) {
                float account1 = account / 100 * 2;
                account += account1;
                float account2 = account / 100 * 2;
                System.out.println("Прирост суммы за " + arr[i] + " = " + account2 + " грн.");
            }
            if (i > 1 && i <= 7) {
                account6 = account / 100 * 2;
                account3 += account6;
            } else ;
        }
        for (int i = 0; i < 60; i++) {
            account5 = account / 100 * 2;
            account4 += account5;
            if (i > 0 && i < 24) {
                account7 = account / 100 * 2;
                account8 += account7;
            } else ;
        }
        System.out.println("Сумма вклада за пол года = " + account3 + " грн.");
        System.out.println("Сумма вклада за 2 года = " + account8 + " грн.");
        System.out.println("Сумма вклада за 5 лет = " + account4 + " грн.");
    }
//  5.  Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм.
//    Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.


    public static void envelope(int a, int b, int c, int d) {
        if (a <= c && b <= d) System.out.println("Открытка не влезет в конверт");
        else if (a == c + 1 && b == d + 1) System.out.println("Открытка влезет в конверт");
        else System.out.println("Открытка влезет в конверт но условия не соблюдены");
    }

 //  6. Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.

    public static float substance(float x, float y) {
        if (x > y) {
            return x;
        }
        return y;
    }
//  7.  Записать условие, которое является истинным, когда:
//    a) только одно из чисел А и В четное;
//    б) хотя бы одно из чисел А и В положительно;

    public static void env(int a, int b) {
        int a1 = a;
        int b1 = b;
        a = a % 2;
        b = b % 2;

        if (a == 0 || b == 0) System.out.println("Одно из чисел четное");
        if (a1 > 0 || b1 > 0) System.out.println("Одно из чисел положительное");

    }
//  8.  Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
//    для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
    public static void mas() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int kg = 1;
        float ft = 0.453F;
        float gram = 1000;
        gram = gram / ft;

        for (int i = 0; i < 9; i++) {
            int kg1 = kg * arr1[i];
            float ft1 = ft * arr1[i];
            float gram1 = gram * arr1[i];
            System.out.println(kg1 + " фунт = " + ft1 + " кг");
            System.out.println(arr1[i] + " кг. = " + gram1 + " фунта");
        }

    }

//  9.   Напечатать таблицу перевода 1, 2, ... 20 долларов США
//    в гривны по текущему курсу (значение курса вводится с клавиатуры).
    public static void courseCurrency() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите текущий курс:");
        float course = s.nextInt();
        System.out.println("Введите сумму для перевода:");
        float currency = s.nextInt();
        float res = course * currency;
        System.out.println("Сумма перевода составит = " + res);
    }
//  10.  Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//    Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.
    public static void unicellularAmoeba (int amoeba){

        for (int i = 0; i < 24; i+=3){
            amoeba = amoeba * 2;
            System.out.println(amoeba);
        }
    }

//  11.  В массиве записаны оценки по информатике 22 учеников класса.
//    Определить количество учеников, оценка которых меньше среднеи
//     оценки по классу, и вывести номера элементов массива,
//    соответствующих таким ученикам.
    public static void masNumber1 (int[] rating){
        int c =0;
        int d = 0;
        for (int i = 0; i < rating.length; i++){
            c += rating[i];
            d += 1;
        }
        int b = c / d;
        int r = 0;
        for (int i = 0; i < rating.length; i++){
            if (b > rating[i]){
                r +=1;
                System.out.println("У ученика по индексу "+ (r - 1) + " оценка " +rating[i]);
            }

        }
        System.out.println(r + " Учеников у которых оценка ниже средней");
    }



// 12. Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.
    public static void masNumber (int[] number){

        int a = 0;
        int b = 0;
        for (int i = 0; i < number.length; i++){
            int res = number[i]%2;
            int res1 = number[i]%10;
            if (res == 0) a+=1;
            if (res1 == 5) b+=1;

        }
        System.out.println("В масиве " + a + " четных числа");
        System.out.println("Количество элементов заканчивающихся на 5 = " + b);

    }

}



