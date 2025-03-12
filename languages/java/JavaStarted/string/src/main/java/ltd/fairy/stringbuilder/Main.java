/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:20:12 UTC+08:00
 *****************************************************/
package ltd.fairy.stringbuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Lionel Johnson
 */
public class Main {

    public static String build(ArrayList<String> list) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : list) {
            stringBuilder.append(s);
        }

        return stringBuilder.toString();

    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");

        System.out.println(build(list));
        System.out.println(reverse(build(list)));
    }
}
