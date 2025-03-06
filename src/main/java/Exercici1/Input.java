package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message){
        boolean isInputTypeCorrect = false;
        do{
            try{
                printMessage(message);
                scanner.nextByte();
                isInputTypeCorrect = true;
            }catch (InputMismatchException ime){
                printMessage("error byte");
                scanner.nextLine();
            }
        }while (!isInputTypeCorrect);
        return scanner.nextByte();
    }

    public static int readInt(String message){
        try{
            printMessage(message);
            scanner.nextInt();
        }catch (InputMismatchException ime){
            printMessage("error int");
            scanner.nextLine();
            readInt(message);
        }
        return scanner.nextInt();
    }

    public static Float readFloat(String message){
        try{
            printMessage(message);
            scanner.nextFloat();
        }catch (InputMismatchException ime){
            printMessage("error Float");
            scanner.nextLine();
            readFloat(message);
        }
        return scanner.nextFloat();
    }

    public static double readDouble(String message){
        try{
            printMessage(message);
            scanner.nextDouble();
        }catch (InputMismatchException ime){
            printMessage("error Double");
            scanner.nextLine();
            readDouble(message);
        }
        return scanner.nextDouble();
    }

    public static char readChar(String message){
        try{
            printMessage(message);
            return scannChar();
        } catch (Exception e) {
            printMessage("error Char");
            scanner.nextLine();
            return readChar(message);
        }
    }

    public static char scannChar() throws Exception {
        if(scanner.next().length() > 1)
            throw new Exception();

        return scanner.next().charAt(0);
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
