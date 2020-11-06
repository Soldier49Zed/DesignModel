package Proxy.DynaicProxy.Jdk;

/**
 * @Author: HouX
 * @Date: 2020/11/4
 * @Description:
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}
