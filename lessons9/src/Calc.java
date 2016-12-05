/**
 * Created by bereznoy on 02.12.2016.
 */
public class Calc {


    public static int sum(int a, int b){
        return a + b;

    }
    public static double sum(double a,double  b){
        return a + b;
    }
    public static int  sum(String a, String b){
       return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static int sumMinus(int a, int b){
        return a - b;

    }
    public static double sumMinus(double a,double  b){
        return a - b;
    }
    public static int  sumMinus(String a, String b){
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    public static int sumUmnogenie(int a, int b){
        return a * b;

    }
    public static double sumUmnogenie(double a,double  b){
        return a * b;
    }
    public static int  sumUmnogenie(String a, String b){
        return Integer.parseInt(a) * Integer.parseInt(b);
    }

    public static int sumDelenie(int a, int b){
        return a / b;

    }
    public static double sumDelenie(double a,double  b){
        return a / b;
    }
    public static int  sumDelenie(String a, String b){
        return Integer.parseInt(a) / Integer.parseInt(b);
    }
}
