package expulsion.secondaryExpulsion;

import expulsion.Expulsion;
import student.Student;

public class NoSecondaryExpulsion implements Expulsion {
    public void expulse(Student student){
        student.setIsExpulsed(false);
    }

    @Override
    public String toString() {
        return "Повезло. Нет причин отчислить!";
    }
}
