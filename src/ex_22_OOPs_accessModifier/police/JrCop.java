package ex_22_OOPs_accessModifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(5);
        jrCop.canIShoot();
    }
}

//Private means only within the class
//Public means everywhere
//Protected basically means in my package
//Default is work within the package
