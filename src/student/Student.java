package student;

public class Student {
    private final StudentType studentType;
    private final String[] subjectDebts;
    private final String name;
    private String reason = "Пока не отчислен. Везёт!";
    private boolean isExpulsed = false;

    public Student(String name, StudentType studentType, String... debts) {
        this.name = name;
        this.studentType = studentType;
        subjectDebts = debts;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public String[] getSubjectDebts() {
        return subjectDebts;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void printExpulsionInfo() {
        System.out.println("Имя: " + name + "\nТип студента: " + studentType);
        System.out.println("Отчислен: " + isExpulsed + "\n" + reason + "\n");
    }

    public boolean getIsExpulsed() {
        return isExpulsed;
    }

    public void setIsExpulsed(boolean isExpulsed) {
        this.isExpulsed = isExpulsed;
    }
}
