package Strategy;

/**
 * @Author: HouX
 * @Date: 2020/11/17
 * @Description: 橡皮鸭
 */
public class RubberDuck extends Duck {


    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }

    public void quack() {
        System.out.println("吱吱叫");
    }
}
