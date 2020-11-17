package Strategy;

/**
 * @Author: HouX
 * @Date: 2020/11/17
 * @Description:
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //绿头鸭使用Quack类处理呱呱叫，所以当performQuack()被调用时，叫的侄儿被委托给Quack对象，得到了真正的呱呱叫
        quackBehavior = new Quack();
        //使用flyWithWings作为其flyBehavior类型
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一个  绿头鸭");
    }

}
