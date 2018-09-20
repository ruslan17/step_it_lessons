package inheritance.uni;

public class Main {

//    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите количество людей в универе: ");
//        int n = sc.nextInt();
//
//        AcademyStaff[] humans = new AcademyStaff[n];
//
//            for (int i = 0; i < humans.length; i++) {
//                if (i < humans.length/10) {
//                    humans[i] = new Teacher();
//                } else {
//                    humans[i] = new Student();
//                }
//
//            }
//
//        for (AcademyStaff human : humans) {
//            System.out.println(human);
//        }
//
//
//
//
//
//        int count = 0;
//
//        for (AcademyStaff h : humans) {
//            if (h.isTeacher()) {
//                count++;
//            }
//        }
//
//        System.out.println("В универе преподавателей: " + count);
//
//        int count1 = 0;
//
//        for (AcademyStaff h: humans) {
//            if (h instanceof Teacher) {
//                count1++;
//            }
//        }
//
//        System.out.println("В универе преподавателей: " + count1);
//
//        int count2 = 0;
//
//        for (AcademyStaff h: humans) {
//            if (h.equals(new Teacher())) {
//                   count2++;
//            }
//        }
//
//        System.out.println("EXAMPLE " + count2);


//        ---------------------


//    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Henry", 25, 1500);
        Teacher teacher1 = new Teacher("John", 27, 2000);

        Student student = new Student("Ken", 15, 3);
        Student student1 = new Student("Kenny", 17, 4);

//        System.out.println(teacher.compare(teacher1));
//        System.out.println(teacher1.compare(teacher));
//        System.out.println(teacher.compare(teacher));

//        System.out.println(student.compare(teacher));

    }

}
