/**
 * Created by bereznoy on 22.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        int x = 21;
        if (x % 2 == 0) System.out.println("Число четное");
        else System.out.println("не четное");

        int mon1 = 9;
        mon(mon1);
        int score = 1;
        mon2(score);
        int score1 = 1;
        mon3(score1);
        System.out.println();

    }

    static void mon(int mon1) {
        if(mon1 == 9) System.out.println("Програмист празднует ");
        else System.out.println("Програмист работает");
    }

    static void mon2(int score) {
        if(score == 0) System.out.println("Проиграшь");
        else if(score == 1) System.out.println("Ничья");
        else System.out.println("Выиграш");
    }
    String whichIsGreoter(int num) {
        num = 23;
        int fist = num/10;
        int second = num%10;


        if(fist > second) return "first";
        else return "second";

    }
    static void mon3(double score1, double score2) {

        if(score1 > score2) System.out.println(score2 + "Больше");
        else System.out.println(score1 + "Меньше");

    }
    static String isLacy(int num) {
        num = 123321;
        int a = num/100000;
        int b = (num/100000)%10;
        int c = (num/10000)%10;
        int d = (num/100)%10;
        int i = (num/10)%10;
        int f = num%10;
        int second = num%100;
    if ((a+b+c) == (d+i+f)) return "счастливый";
        else return "не счастливый";

}
}
