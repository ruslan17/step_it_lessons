package inheritance.uni;

public class Student extends AcademyStaff implements Compare {

    private int middleMark;

    public int getMiddleMark() {
        return middleMark;
    }

    public void setMiddleMark(int middleMark) {
        this.middleMark = middleMark;
    }

    public Student() {
        System.out.println("Student");
    }

    public Student(String name, int age, int middleMark) {
        super(name, age);
        this.middleMark = middleMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return middleMark == student.middleMark;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + middleMark;
        return result;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compare(Human human) {

        if (getClass() != human.getClass()) {
            return 404;
        }
//
//        if (!(human instanceof Student)) {
//            return 404;
//        }

        Student student = (Student) human;

        return middleMark - student.middleMark;
    }
}
