import java.util.Random;

/**
 * Created by bereznoy on 04.12.2016.
 */
public enum Faculty {
//    2) Объявить класс перечислений Faculty у которого будут свойства nameEn(строка),
//    nameRu(строка), и элементы перечисления: GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW.
    GRYFFINDOR("Gryffindor","Грифиндор",5),
    SLYTHERIN("Slytherin","Слизарин",5),
    HUFFLEPUFF("Hufflepuff","Пуффендуй",5),
    RAVENCLAW("Ravenclaw","Когтевран",5);

    String nameEN;
    String nameRU;
    int capacityGroup;
    Faculty(String nameEN, String nameRU,int capacityGroup) {
        this.nameEN = nameEN;
        this.nameRU = nameRU;
        this.capacityGroup = capacityGroup;
    }
    public static Faculty getRandomFaculty()  {
        Faculty[] arr = Faculty.values();
        Random random = new Random();
        return arr[random.nextInt(arr.length)];


    }


}
