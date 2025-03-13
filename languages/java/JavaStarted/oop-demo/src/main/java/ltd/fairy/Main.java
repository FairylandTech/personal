/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Lionel Johnson
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-03-12 23:32:55 UTC+08:00
 *****************************************************/
package ltd.fairy;

/**
 * @author Lionel Johnson
 */
public class Main {

    public static void main(String[] args) {

        PingPangCoach coachPingPang = new PingPangCoach("乒乓球教练", 45);
        System.out.println(coachPingPang.name);
        System.out.println(coachPingPang.age);
        coachPingPang.teach();
        coachPingPang.speak();
        
        PingPangSportsMan playerPingPang = new PingPangSportsMan("乒乓球运动员", 18);
        System.out.println(playerPingPang.name);
        System.out.println(playerPingPang.age);
        playerPingPang.study();
        playerPingPang.speak();

        BasketballCoach coachBasketball = new BasketballCoach("篮球教练", 50);
        System.out.println(coachBasketball.name);
        System.out.println(coachBasketball.age);
        coachBasketball.teach();

        BasketballSportsMan playerBasketball = new BasketballSportsMan("篮球运动员", 20);
        System.out.println(playerBasketball.name);
        System.out.println(playerBasketball.age);
        playerBasketball.study();
    }
}
