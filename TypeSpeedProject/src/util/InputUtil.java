package util;

import java.util.Scanner;

public class InputUtil {

    public static int requiredInputInt(String tittle){
        Scanner scanner = new Scanner(System.in);
        System.out.println(tittle);
        return scanner.nextInt();
    }

    public static String requiredInputStr (String tittle){
        Scanner scanner = new Scanner(System.in);
        System.out.println(tittle);
        return scanner.nextLine();
    }


}
