/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:42:13 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class PingPangCoach extends Coach implements English {

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("PingPangCoach Teach");
    }

    @Override
    public void speak() {
        System.out.println("PingPangCoach Speak English");
    }
}
