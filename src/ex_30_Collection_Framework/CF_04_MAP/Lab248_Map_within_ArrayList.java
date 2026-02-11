package ex_30_Collection_Framework.CF_04_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab248_Map_within_ArrayList {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("name", "pramod");
        student1.put("roll","1");
        student1.put("phone","859880317");
        System.out.println(student1);

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("name", "amit");
        student2.put("roll","2");
        student2.put("phone","859880567");
        System.out.println(student2);

        List students = new ArrayList<>();//This is called list of MAP
        students.add(student1);
        students.add(student2);
        System.out.println(students);//List of student containing two student

    }
}
//Output - LIST OF MAP - it will be used in JSON
//{phone=859880317, name=pramod, roll=1}
//{phone=859880567, name=amit, roll=2}
//[{phone=859880317, name=pramod, roll=1}, {phone=859880567, name=amit, roll=2}]