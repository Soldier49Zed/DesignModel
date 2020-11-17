package Strategy;

/**
 * @Author: HouX
 * @Date: 2020/11/17
 * @Description:
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
