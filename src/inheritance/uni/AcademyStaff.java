package inheritance.uni;

public class AcademyStaff extends Human {

    @Override
    public String getDescription() {
        return "Участник академии";
    }

    public boolean isTeacher() {
        return false;
    }

    public AcademyStaff(String name, int age) {
        super(name, age);
    }

    public AcademyStaff() {
        System.out.println("AcademyStaff");
    }



}
