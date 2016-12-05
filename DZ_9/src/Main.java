import java.util.Scanner;

/**
 * Created by bereznoy on 04.12.2016.
 */
public class Main {
    public static void main (String[] args){
        Students students = new Students();
        Student student = new Student(Lang.EN);
        System.out.println(students);
        System.out.println(student);
        System.out.println(Faculty.getRandomFaculty());

        String[] arrStudents = {
                "Боунс Сьюзен",
                "Голдстейн Энтони",
                "Дингл Гарольд",
                "Смит Захария",
                "Макмиллан Эрни",
                "Патил Парвати",
                "Поттер Гарри",
                "Томас Дин",
                "Уизли Рон",
                "Финниган Симус",
                "Гринграсс Дафна",
                "Забини Блейз",
                "Крэбб Винсент",
                "Малфой Драко",
                "Паркинсон Пэнси",
                "Бут Терри",
                "Корнер Майкл",
                "Патил Падма",
                "Турпин Лайза",
                "Чанг Чжоу"

        };
        students.listStudents(arrStudents);
        Scan.scan();



    }
}
