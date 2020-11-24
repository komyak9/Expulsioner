package expulsion.secondaryExpulsion;

import expulsion.Expulsion;
import student.Student;

public class FullMoonExpulsion implements Expulsion {
    public void expulse(Student student){
        if (!SecondaryParameters.RANDOM.getActive()){
            student.setIsExpulsed(SecondaryParameters.FULLMOON.getActive());
        }
    }

    @Override
    public String toString() {
        return "Полная Луна";
    }
}
