/**
 * Created by bereznoy on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) {

//      1.  Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце. Рассмотреть два случая:
//        год не является високосным;
//        2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).
        int myInt = Integer.parseInt(args[0]);
if (myInt == 365)year(2);
    else if (myInt == 366)leapYear(2);



suit(12,4);

weekDay(11);
     //   weekDayB(11, 3);
        translationNumber(5);

        myString("Слово");
        String mySellingString = "";
        System.out.println(myString(mySellingString));

        myArrayString(5);
        emailAddress("Beeeee@mail.ru");
//        9. Создать класс Book с полями: name (строка), bookType (перечисление), author (строка), year (целое число).
//        Написать конструктор со всеми параметрами. Опишите с помощью enum тип данных для хранения литературных жанров
//        (роман, сказка, комедия, драма, научная фантастика, детектив). Создать объекты класса книга
//        (число объектов соответствует числу жанров).
        Book novel = new Book("Идиот", Book.BookType.NOVEL,"Достоевский Ф.М.",1868);
        Book story = new Book("Дюймовочка", Book.BookType.STORY,"Ганс Христиан Андерсон",1835);
        Book drama = new Book("Слобода Неволя", Book.BookType.DRAMA,"Дмитрий Васильевич Аверкиев",1867);
        Book comedy = new Book("Двенадцать стульев", Book.BookType.COMEDY,"Илья Ильф",2004);
        Book science = new Book("Я, робот", Book.BookType.SCIENCE,"Айзек Азимов",1950);
        Book detective = new Book("Десять негритят", Book.BookType.DETECTIVE,"Агата Кристи",1939);









    }

// 1.   Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце. Рассмотреть два случая:
//    год не является високосным;
//    2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).


    public static void year (int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("в этом месяце 31 дней");
                break;
            case 2:
                System.out.println("в этом месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("в этом месяце 30 дней");
            default:
                System.out.println("Я незнаю такого месяца");
        }
    }
    public static void leapYear (int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("в этом месяце 31 дней");
                break;
            case 2:
                System.out.println("в этом месяце 29 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("в этом месяце 30 дней");
            default:
                System.out.println("Я незнаю такого месяца");
        }
    }
//    2. Мастям игральных карт условно присвоены следующие порядковые номера:
//    масти "пики" — 1, масти "трефы" — 2, масти "бубны" — 3, масти "червы" — 4,
//    а достоинству карт: "валету" — 11, "даме" — 12, "королю" — 13, "тузу" — 14
//            (порядковые номера карт остальных достоинств соответствуют их названиям:
//            "шестерка", "девятка" и т. п.). По заданным номеру масти m (1 <= m <=  4)
//    и номеру достоинства карты k (6 <= k <= 14) определить полное название (масть и достоинство)
//    соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.
    public static void suit (int d, int m) {



        switch (d){
            case 11:
                System.out.print("Валет");
                break;
            case 12:
                System.out.print("Дама");
                break;
            case 13:
                System.out.print("Король");
                break;
            case 14:
                System.out.print("Туз");
                break;
            case 6:
                System.out.print("Шесть");
                break;
            case 7:
                System.out.print("Семь");
                break;
            case 8:
                System.out.print("Восемь");
                break;
            case 9:
                System.out.print("Девять");
                break;
            case 10:
                System.out.print("Десять");
                break;
              default:
                  System.out.println("Карты такого достоинства не существует");
        }

        switch (m){
            case 1:
                System.out.println(" Пики");
                break;
            case 2:
                System.out.println(" Трефы");
                break;
            case 3:
                System.out.println(" Бубны");
                break;
            case 4:
                System.out.println(" Червы");
                break;
            default:
                System.out.println("Не известная масть");
        }
    }
//3.  Дано целое число k (1 <= k <= 365). Определить, каким днем недели
//   (понедельником, вторником, ..., субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
//    а) понедельник;
       public static void weekDay (int yearDay) {
        String week = "";
        int x = yearDay%7 == 0? 7:yearDay%7;
         switch (x) {
            case 1: week = "Понедельник";
                break;
            case 2: week = "Вторник";
                break;
            case 3: week = "Среда";
                break;
            case 4: week = "Четверг";
                break;
            case 5: week = "Пятница";
                break;
            case 6: week = "Суббота";
                break;
            case 7: week = "Воскресенье";
                break;
            default:
                System.out.println("Нет такого дня недели");
        }
        System.out.println(week);

    }
//  б) i-й день недели (если 1 января — понедельник, то d=1 , если вторник — d=2, ..., если воскресенье —  d= 7).
//public static void weekDayB (int y, int x) {
//    int t = y%7 == 0? 7:y%7;
//    String[] arr = {"пн","вт","С","Ч","П","С","В"};
//    for (int i = x; i <= arr.length; i++) {
//
//        System.out.println(arr[i]);
//    }

//}

//  4.   Напишите программу для перевода чисел от 1 до 10 в строковое значение.
//       Например, для числа 1 результатом будет строка “one”.

public static void translationNumber (int number) {
    switch (number)
    {
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
        default:
            System.out.println("Выбирите число от 1 до 10");

    }



}

//    5. Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.

    public static String myString (String sellingString) {

        char [] arr = sellingString.toCharArray();
        String mySellingString = "";
        for(int i = arr.length-1; i >= 0; i--) {
            mySellingString += arr[i];
        }
        return mySellingString;
    }


//    7. Дан массив строк. Написать программу, которая:
//    а) выводит на экран значение всех строк через запятую, длина которых больше n.


    public static void myArrayString (int symbolLong) {
        String[] arr = {"Привет","Привет","Игра","Гулять"};
                for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length() > symbolLong) System.out.print(arr[i] + ",");
        }
        System.out.println();
        String unique = "";
      //  б) выводит на экран значение всех неповторяющихся строк через запятую.
        for (int j = 0; j < arr.length  ; j++) {
            if (j != 0) unique = arr[j-1];
            if (!unique.equals(arr[j])) System.out.print(arr[j] + ",");
        }
    }


//    6. Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать условию (пример - emailaddr@domain.zone)
//    1)	emailaddr > 4 символов
//    2)	1 < domain < 10
//            3)	2 <= zone < 5
//    При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.

    public static void emailAddress (String email) {
        System.out.println();
        int address = email.indexOf("@");

        if (address <= 4) System.out.println(" Адрес должень стостоять минимум из 4 символов");
        int domain = email.lastIndexOf(".");
        if (domain - address < 2 )
            System.out.println("Домен должень стостоять минимум из 1 символа");
        if (domain - address >= 10)
            System.out.println("Домен должень стостоять максимум из 10 символов");
        int zone = email.length();
        if (zone - domain <=2 )
            System.out.println("Зона должна стостоять минимум из 2 символов");
        if (zone - domain >5) System.out.println("Зона должна стостоять максимум из 4 символов");
        else;


    }





}
