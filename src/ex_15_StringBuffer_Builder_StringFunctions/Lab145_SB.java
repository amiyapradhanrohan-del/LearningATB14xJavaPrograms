package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");

        stringBuffer.append("Dutta");
        System.out.println(stringBuffer); //Output - PramodDutta


        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1); //Output - PRamodDutta  //string is immutable is nature.
        //here two string will add and give the result as PRamodDutta
    }
}
