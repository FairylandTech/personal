/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:35:37 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class Person {
    public String name;
    public int age;

    private Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
