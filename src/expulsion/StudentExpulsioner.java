package expulsion;

import expulsion.secondaryExpulsion.SecondaryParameters;
import student.Student;

public class StudentExpulsioner {
    private final Beer beer;
    private final boolean[] luckyStudentType;
    private final DebtsExpulsion debtsExpulsion;

    public StudentExpulsioner(boolean[] parameters){
        debtsExpulsion = new DebtsExpulsion();
        beer = new Beer((int)(Math.random()*4));

        luckyStudentType = new boolean[3];
        System.arraycopy(parameters, 0, luckyStudentType, 0, 3);

        SecondaryParameters.RANDOM.setActive(parameters[3]);
        SecondaryParameters.FULLMOON.setActive(parameters[4]);

        printExpulsionerInfo(parameters);
    }

    public void expulse(Student student){
        student.getStudentType().expulse(student);
        debtsExpulsion.expulse(student);
        checkLucky(student);
        student.printExpulsionInfo();
    }

    public void checkLucky(Student student){
        for (int i = 0; i < 3; i++){
            if (luckyStudentType[i] && student.getStudentType().ordinal() == i && beer.getCount() > 0){
                student.setIsExpulsed(false);
                student.setReason("Не отчислен! Повезло! Держи пиво!");
                beer.setCount(beer.getCount()-1);
            }
        }
    }

    public void printExpulsionerInfo(boolean[] parameters){
        System.out.println("Конфигурация отчислятора: ");
        for (boolean b : parameters){
            System.out.print(b + " ");
        }
        System.out.println("\nКоличество бутылок пива: " + beer.getCount() + "\n");
    }
}
