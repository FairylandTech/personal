/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:14:50 UTC+08:00
 *****************************************************/
package ltd.fairy.demo;

import java.util.Scanner;

/**
 * @author Lionel Johnson
 */
public class LoopString {
    static void loopString(String string) {
        for (char s : string.toCharArray()) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String string = scanner.next();
        
        loopString(string);
    }
}
