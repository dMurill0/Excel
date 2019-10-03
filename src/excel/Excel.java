package excel;

import comandos.Command;
import comandos.CommandParser;
import java.util.*;
import java.util.Scanner;

public class Excel {

    public static void main(String[] args) {

        boolean salir = false;
        Book b = new Book();
        while (!salir) {
            System.out.println("Introduce una instrucción");
            Scanner sc = new Scanner(System.in);
            String instruction = sc.nextLine();
            CommandParser cp = new CommandParser();
            if (!cp.doIt(b, instruction)) {
                System.out.println("ERROR");
            }
            if (instruction.equals("salir")) {
                salir = true;
            }

        }
    }

}
