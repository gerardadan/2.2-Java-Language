package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static void readByte(String message){
        try{
            System.out.println(message);
            byte n = scanner.nextByte();
        }catch (InputMismatchException ime){
            System.out.println("error byte");
            scanner.next();
        }
    }
}
