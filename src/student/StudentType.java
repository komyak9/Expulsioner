package student;

import expulsion.Expulsion;
import expulsion.secondaryExpulsion.FullMoonExpulsion;
import expulsion.secondaryExpulsion.NoSecondaryExpulsion;
import expulsion.secondaryExpulsion.RandomExpulsion;

public enum StudentType {
    ROBOTECH(new NoSecondaryExpulsion()),
    IVT(new RandomExpulsion()),
    SPPO(new FullMoonExpulsion());


    private final Expulsion secondaryExpulsion;

    StudentType(Expulsion secondaryExpulsion){
        this.secondaryExpulsion = secondaryExpulsion;
    }

    public void expulse(Student student){
        secondaryExpulsion.expulse(student);
        secondaryExpulsion.setReason(student);
    }
}
