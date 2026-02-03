package ex_27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220_Throws {
    public static void main(String[] args)  {

        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }
    }
}

//By using try catch
//Output -
//C:\a.log (The system cannot find the file specified)
//yes