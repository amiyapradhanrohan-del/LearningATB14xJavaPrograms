package ex_24_Static;

public class Lab193_Static_P2 {
}

class ATB{

    int phone_np; //Non static because phone no is different for all, this value is not accessible until the object is created
    String name; //Non static because name is different for all the students

    static String course_name = "ATB";//static because course is same for all the students

    static void markAttendance(){
        System.out.println("Mark Attendance");
      //  System.out.println(this.phone_np); //static function can not access the non static value
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name); //non static function can access the static value
    }
}
//Non static methods can access the static value
//Static methods can not access the non static value
