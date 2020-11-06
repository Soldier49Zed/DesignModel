package Proxy.DynaicProxy.CGlib;

/**
 * @Author: HouX
 * @Date: 2020/11/5
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("张三");
    }
}
