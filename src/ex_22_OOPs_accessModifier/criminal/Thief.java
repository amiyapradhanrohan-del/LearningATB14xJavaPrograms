package ex_22_OOPs_accessModifier.criminal;

import ex_22_OOPs_accessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
     //   thief.canIShoot(); -canIShoot() function is private in nature so it can not be used
      //  thief.thisDefaultF1(); - Here default will not allowed, default is only allowed within the package name
    }
}
