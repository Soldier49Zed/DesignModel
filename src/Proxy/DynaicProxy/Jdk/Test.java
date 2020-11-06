package Proxy.DynaicProxy.Jdk;


/**
 * @Author: HouX
 * @Date: 2020/11/4
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        JdkProxyExample jdk = new JdkProxyExample();

        //绑定关系，因为挂在接口HelloWorld下，所以声明代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());

        //此时HelloWorld对象已经是一个代理对象，他会进入代理的逻辑方法invoke里
        proxy.sayHelloWorld();

    }
}