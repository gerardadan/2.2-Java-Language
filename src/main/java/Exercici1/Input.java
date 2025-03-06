package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) throws InputMismatchException{
        printMessage(message);
        return scanner.nextByte();
    }

    public static int readInt(String message) throws InputMismatchException{
        printMessage(message);
        return scanner.nextInt();
    }

    public static Float readFloat(String message)throws InputMismatchException{
        printMessage(message);
        return scanner.nextFloat();
    }

    public static double readDouble(String message)throws InputMismatchException{
        printMessage(message);
        return scanner.nextDouble();
    }

    public static char readChar(String message)throws Exception{
        printMessage(message);
        if(scanner.next().length() > 1)
            throw new Exception("Value out of range");
        return scanner.next().charAt(0);
    }

    public static String readString(String message)throws Exception{
        printMessage(message);
        if(scanner.next().isEmpty())
            throw new Exception("Empty value");
        return scanner.nextLine();
    }

    public static Boolean readBoolean(String message)throws Exception{
        printMessage(message);
        return scanner.nextBoolean();
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
