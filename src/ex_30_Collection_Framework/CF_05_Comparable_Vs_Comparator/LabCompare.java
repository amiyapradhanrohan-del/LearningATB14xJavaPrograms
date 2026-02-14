package ex_30_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Example using Comparable (Natural Order)
public class LabCompare {
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Amit");
        Employee e2 = new Employee(1,"Pramod");
        Employee e3 = new Employee(5,"Dutta");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(employeeList); // [3 - Amit, 1 - Pramod, 5 - Dutta]
        Collections.sort(employeeList);
        System.out.println(employeeList); // [1 - Pramod, 3 - Amit, 5 - Dutta] - Compare based on the IDs
        //[3 - Amit, 5 - Dutta, 1 - Pramod] - Compare based on the names

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;

    //We can also create a getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
        //we can use override method or we can print the details like this
    }
        public String printDetails () {
            return id + " - " + name;
        }

    @Override
    public int compareTo(@NotNull Employee o) {
    //    return this.id-o.id; //Compare by Id
        return this.name.compareTo(o.name);
        //Java does not allow subtraction of Strings, it allows compareTo function
    }
}
//Output -
//[3 - Amit, 1 - Pramod, 5 - Dutta]
//[3 - Amit, 5 - Dutta, 1 - Pramod]
//In case of String "-"(minus) does not work