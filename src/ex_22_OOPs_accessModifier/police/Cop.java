package ex_22_OOPs_accessModifier.police;

public class Cop {

    public int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

    // Method and Behave
//    public void canIShoot(){ //It is public in nature so anyone can be used
//    private void canIShoot(){ //Private means only allowed it within the class
    protected void canIShoot(){ //protected means in the police package anybody can use it.
    System.out.println("Yes you can !!");
    }

    void thisDefaultF1(){
        System.out.println("Hi, Cop!");
    }
}
