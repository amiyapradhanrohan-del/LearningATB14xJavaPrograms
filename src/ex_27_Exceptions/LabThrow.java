package ex_27_Exceptions;

import java.util.Scanner;

public class LabThrow {
    public static void main(String[] args) throws CustomException {
        Scanner scanner = new Scanner(System.in);
        if(!scanner.next().equalsIgnoreCase("Pramod")){
            throw new CustomException("Bhag yaha se not allowed!");

        }
    }
}
