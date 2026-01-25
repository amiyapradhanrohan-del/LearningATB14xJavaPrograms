package ex_24_Static;

public class Lab192_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23); //age will be different, it is non static
        Student s2 = new Student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(Student.course_name); //course name is same, so it is static

        //we can call the course name by using reference also
        System.out.println(s1.course_name);
        System.out.println(s2.course_name);

    }
}
class Student{
    int age; //Non Static or Instance Variable, Attribute //diff students having diff age so it is non static
    static String course_name = "ATB"; //course is same for all, so it is static

    public Student(int age_c){
        this.age = age_c;
    }

    static void m1(){
        System.out.println("I am static method");
    }
}

//Output -
//23
//33
//ATB
//ATB
//ATB
