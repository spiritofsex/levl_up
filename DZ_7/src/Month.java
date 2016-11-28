/**
 * Created by bereznoy on 28.11.2016.
 */
public enum Month {
    JANUARY(1,"january","Январь",31),
    FEBRUARY(2,"february","Февраль",31),
    MARCH(3,"march","Март",31),
    APRIL(4,"april","Апрель",31),
    MAY(5,"may","Май",31),
    JUNE(6,"june","Июнь",31),
    JULY(7,"july","Июль",31),
    AUGUST(8,"august","Август",31),
    SEPTEMBER(9,"september","Сентябрь",31),
    OCTOBER(10,"october","Октябрь",31),
    NOVEMBER(11,"november","Ноябырь",31),
    DECEMBER(12,"december","Декабрь",31);

    int numberMonth;
    String endName;
    String ruName;
    int dayMonth;

    Month(int numberMonth, String endName, String ruName, int dayMonth) {
        this.numberMonth = numberMonth;
        this.endName = endName;
        this.ruName = ruName;
        this.dayMonth = dayMonth;
    }


    public int getNumberMonth() {
        return numberMonth;
    }

    public String getEndName() {
        return endName;
    }

    public String getRuName() {
        return ruName;
    }

    public int getDayMonth() {
        return dayMonth;
    }
}

