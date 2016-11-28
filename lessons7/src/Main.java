/**
 * Created by bereznoy on 25.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        test(5);
        test1(3);

        test2(3);
        test3(3);

    }
    public static void test(int a){
        switch (a){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Воскресенье");
                default:
                    System.out.println("Ты кто такой?");





        }



    }
    public static void test1 (int m) {
        switch (m) {
            case 1:
                System.out.println("Пика");
                break;
            case 2:
                System.out.println("Трефи");
                break;
            case 3:
                System.out.println("Бубны");
                break;
            case 4:
                System.out.println("Черви");

                default: System.out.println("пусто");
        }


    }

    public static void test2 (int s) {


    }
    public static void test3 (int b) {
        for (int j = 1; j<=6; j++) {
            for (int i = 1; i <= 6; i++) {
                if (j != 1 || j !=6){
                    if(i == 1 || j == 6) System.out.print("*");
                        else System.out.print(" ");
                }else System.out.print("*");

            }
            System.out.println();
        }
    }
}
