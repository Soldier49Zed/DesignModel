package ChainOfResponsibility;

import Proxy.DynaicProxy.Jdk.HelloWorld;
import Proxy.DynaicProxy.Jdk.HelloWorldImpl;
import Proxy.DynaicProxy.Jdk_Interceptor.InterceptorJdkProxy;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "ChainOfResponsibility.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(proxy1, "ChainOfResponsibility.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(proxy2, "ChainOfResponsibility.Interceptor3");
        proxy3.sayHelloWorld();
    }
}

//before方法按照从最后一个拦截器到第一个拦截器的加载顺序运行，
//而after方法则按照从第一个拦截器到最后一个拦截器的加载顺序运行。
