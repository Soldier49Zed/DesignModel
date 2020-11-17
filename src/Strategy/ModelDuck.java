package Strategy;

/**
 * @Author: HouX
 * @Date: 2020/11/17
 * @Description:
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();

        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("我是一个  模型鸭");
    }
}
