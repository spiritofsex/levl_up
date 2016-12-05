import java.util.Random;

/**
 * Created by bereznoy on 04.12.2016.
 */
public class Students  {

//    3) Описать объект студента который должен обладать свойствами: имя(строка),
//    фамилия(строка), возраст(число), язык(перечисление), факультет(перечисление).
    String name = "Harry";
    String surName = "Potter";
    int age = 15;
    Lang lang = Lang.EN ;
    Faculty faculty = Faculty.GRYFFINDOR;

    public String toString(){
        return "Имя = " + name + " Фамилия = "+ surName +" Возраст = "+ age + " Факультет = " + faculty;
    }
    public void listStudents (String[] arrStudents) {

        int gryffindor = 0;
        int slytherin = 0;
        int hufflepuff = 0;
        int ravenclaw = 0;

        Faculty faculty;
        for(String s : arrStudents){
                faculty = Faculty.getRandomFaculty();


                if (faculty == Faculty.GRYFFINDOR && gryffindor < Faculty.GRYFFINDOR.capacityGroup  ){
                    System.out.println(s + " зачислен в " + Faculty.GRYFFINDOR);
                    gryffindor++;
                } else if (faculty == Faculty.SLYTHERIN && slytherin < Faculty.SLYTHERIN.capacityGroup  ) {
                    System.out.println(s + " зачислен в " + Faculty.SLYTHERIN);
                    slytherin++;
                }else if (faculty == Faculty.HUFFLEPUFF && slytherin < Faculty.HUFFLEPUFF.capacityGroup  ) {
                    System.out.println(s + " зачислен в " + Faculty.HUFFLEPUFF);
                    hufflepuff++;
                }else if (faculty == Faculty.RAVENCLAW && slytherin < Faculty.RAVENCLAW.capacityGroup  ) {
                    System.out.println(s + " зачислен в " + Faculty.RAVENCLAW);
                    ravenclaw++;
                }
                }
            }


        }



