import java.util.Scanner;

/**
 * Created by bereznoy on 05.12.2016.
 */
public class Scan {

    public static void scan (){
    Scanner scanner =new Scanner(System.in);
    while (true) {
        System.out.println("В ведите оператор");
        String operator = scanner.next();
        System.out.println("В первое число");
        int a = scanner.nextInt();
        System.out.println("В второе число");
        int b = scanner.nextInt();
        switch (operator) {
            case "+":
                System.out.println("Результат = " + Calc.sum(a, b));
                break;
            case "-":
                System.out.println("Результат = " + Calc.sumMinus(a, b));
                break;
            case "*":
                System.out.println("Результат = " + Calc.sumUmnogenie(a, b));
                break;
            case "/":
                System.out.println("Результат = " + Calc.sumDelenie(a, b));
                break;
        }
        System.out.println("Продолжаем? y/n");
        String exitWord = scanner.next();
        if (exitWord != null && exitWord.length() > 0 && !exitWord.equalsIgnoreCase("y")) break;


    }

    }



}
