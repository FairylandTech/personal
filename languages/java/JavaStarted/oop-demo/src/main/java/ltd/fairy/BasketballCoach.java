/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:43:54 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class BasketballCoach extends Coach {

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("BasketballCoach Teach");
    }
}
