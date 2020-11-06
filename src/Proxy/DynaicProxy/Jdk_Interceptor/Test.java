package Proxy.DynaicProxy.Jdk_Interceptor;

import Proxy.DynaicProxy.Jdk.HelloWorld;
import Proxy.DynaicProxy.Jdk.HelloWorldImpl;

/**
 * @Author: HouX
 * @Date: 2020/11/5
 * @Description: 拦截器
 */
public class Test {
    public static void main(String[] args) {
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),"Proxy.DynaicProxy.Jdk_Interceptor.MyInterceptor");
        proxy.sayHelloWorld();
    }
}
