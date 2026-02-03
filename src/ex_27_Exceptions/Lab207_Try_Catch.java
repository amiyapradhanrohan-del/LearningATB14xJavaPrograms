package ex_27_Exceptions;

public class Lab207_Try_Catch {
    public static void main(String[] args) {
        String s1 = null;

        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error, Trim not allowed for the null values");
        }


        //This is an example of Unchecked null pointer
    }
}

//Output - Error, Trim not allowed for the null values