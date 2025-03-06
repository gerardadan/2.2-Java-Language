package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readByte("Set byte");
        readChar("Set letter");

        System.out.println("Fin");
    }

    public static byte readByte(String message) {
        try {
            return Input.readByte(message);
        } catch (InputMismatchException ime) {
            System.out.println("Error byte");
            Input.scanner.nextLine();
            return readByte(message);
        }
    }

    public static char readChar(String message) {
        try {
            return Input.readChar(message);
        } catch (Exception ime) {
            System.out.println("Error char");
            Input.scanner.nextLine();
            return readChar(message);
        }
    }
}