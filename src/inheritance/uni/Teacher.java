package inheritance.uni;

public class Teacher extends AcademyStaff implements Compare {

    @Override
    public String toString() {
        return super.toString() + " {" +
                "salary=" + salary +
                '}';
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean isTeacher() {
        return true;
    }

    public Teacher() {
        System.out.println("Teacher");
    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public int compare(Human human) {

        if (getClass() != human.getClass()) {
            return 404;
        }

//        if (!(human instanceof Teacher)) {
//            return 404;
//        }

        Teacher teacher = (Teacher) human;

        if (salary - teacher.salary < 0) {
            return -1;
        } if (salary - teacher.salary > 0) {
            return 1;
        } else return 0;
    }
}
