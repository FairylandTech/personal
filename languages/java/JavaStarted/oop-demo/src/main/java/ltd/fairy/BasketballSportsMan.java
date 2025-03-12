/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:41:34 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class BasketballSportsMan extends SportsMan {

    public BasketballSportsMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("BasketballSportsMan Study");
    }
}
