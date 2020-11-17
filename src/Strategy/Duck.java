package Strategy;

/**
 * @Author: HouX
 * @Date: 2020/11/17
 * @Description: 策略模式
 */
public  abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;//每只鸭子都会引用实现QuackBehavior接口的对象

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();//鸭子对象不亲自处理呱呱叫行为,而是委托给quackBehavior引用的对象
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    void swim() {
        System.out.println("所有鸭子都会游泳");
    }

    void display() {
    }



}
