/**
 * Created by bereznoy on 05.12.2016.
 */
public class Student extends Students {
    //    4) Переопределить в классе студента метод toString() таким образом, чтобы в результате его вызова
//    для объекта студента с выбранным языком EN возвращалась строка вида: "Ron Weasley is 24 years old" +
//            " and studying at Griffindor faculty". Либо, если язык был выбран RU возвращалась строка вида:
//            "Ron Weasley 24 лет, студент факультета Гриффиндор".




    public Student(Lang lang) {
        this.lang = lang;

}

    @Override
    public String toString() {
        String res;
        if (lang == lang.EN)
            res = name + surName + " is " + age + " years old and studying at " + faculty.nameEN + " faculty";
        else res = name + surName +" "+ age + " лет, студент факультета " + faculty.nameRU;
        return res;
    }
}
