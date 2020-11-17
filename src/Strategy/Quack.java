package Strategy;

/**
 * @Author: HouX
 * @Date: 2020/11/17
 * @Description:
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
