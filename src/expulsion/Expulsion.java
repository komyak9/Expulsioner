package expulsion;

import student.Student;

public interface Expulsion {
    void expulse(Student student);

    default void setReason(Student student){
        if (student.getIsExpulsed()){
            student.setReason(this.toString());
        }
    }
}
