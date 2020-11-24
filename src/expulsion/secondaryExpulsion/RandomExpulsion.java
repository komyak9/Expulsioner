package expulsion.secondaryExpulsion;

import expulsion.Expulsion;
import student.Student;

public class RandomExpulsion implements Expulsion {
    public void expulse(Student student){
        if (SecondaryParameters.RANDOM.getActive()){
            student.setIsExpulsed((int)(Math.random() * 2) == 1);
        }
    }

    @Override
    public String toString() {
        return "Рандом";
    }
}
