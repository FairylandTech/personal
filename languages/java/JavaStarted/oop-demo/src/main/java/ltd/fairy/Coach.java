/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:38:27 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class Coach extends Person {

    public Coach(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("Teach");
    }
    
}
