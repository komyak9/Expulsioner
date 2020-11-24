package expulsion;

import student.Student;

public class DebtsExpulsion implements Expulsion{
    public void expulse(Student student){
        if (student.getSubjectDebts().length != 0) {
            student.setIsExpulsed(true);
            setReason(student);
        }
    }

    public String toString(){
        return "Долги по проге или ОПД";
    }
}
