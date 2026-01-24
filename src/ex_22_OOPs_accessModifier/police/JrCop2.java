package ex_22_OOPs_accessModifier.police;

public class JrCop2 {
    public static void main(String[] args) {
        Cop j2 = new Cop(100);
        j2.thisDefaultF1(); // Here default function can be user because it is within the package
    }
}
