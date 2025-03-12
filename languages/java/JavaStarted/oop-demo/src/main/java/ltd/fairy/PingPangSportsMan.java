/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:39:08 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class PingPangSportsMan extends SportsMan implements English {

    public PingPangSportsMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("PingPangSportsMan Study");
    }

    @Override
    public void speak() {
        System.out.println("PingPangSportsMan Speak English");
    }
}
