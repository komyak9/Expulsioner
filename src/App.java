import expulsion.StudentExpulsioner;
import student.Student;
import student.StudentType;

public class App {
    public static void main(String[] args){
        boolean[] arguments = new boolean[5];

        for (int i = 0; i < 5; i++){
            arguments[i] = args[i].equals("true");
        }

        StudentExpulsioner studentExpulsioner = new StudentExpulsioner(arguments);

        Student student1 = new Student("Andrey", StudentType.ROBOTECH);
        Student student2 = new Student("Sonya", StudentType.IVT);
        Student student3 = new Student("Nastya", StudentType.SPPO);

        studentExpulsioner.expulse(student1);
        studentExpulsioner.expulse(student2);
        studentExpulsioner.expulse(student3);
    }
}
