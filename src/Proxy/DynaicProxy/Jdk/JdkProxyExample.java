package Proxy.DynaicProxy.Jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: HouX
 * @Date: 2020/11/4
 * @Description:
 */
public class JdkProxyExample implements InvocationHandler {


    //真实对象
    private Object target = null;

    /**
     * 建立代理对象和真实对象的代理关系，并返回代理对象
     *
     * @param target 真实对象
     * @return 代理对象
     */
    //   service  HelloServiceImpl实现的接口
    public Object bind(Object target) {

        this.target = target;

        //获取对应的ClassLoader
        ClassLoader classLoader = target.getClass().getClassLoader();
        //获取target所实现的所有接口
        Class[] interfaces = target.getClass().getInterfaces();
        //取得代理对象
        Object obj = Proxy.newProxyInstance(classLoader, interfaces, this);

        return obj;
    }


    @Override
    /**
     * 代理方法逻辑
     *
     * 代理类的每一个方法被调用的时候都会调用下边的这个invoke方法
     *
     * 通过代理对象调用方法首先进入这个方法.
     * @param proxy --代理对象 就是bind方法生成的对象
     * @param method -- 当前调度的方法.
     * @param args -- 当前调度方法的参数
     * @return 代理结果返回
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");

        System.out.println("在调度真实对象之前的服务");

        Object result = method.invoke(target, args);//相当于调用target.sayHelloWorld();
        System.out.println("在调度真实对象之后的服务");
        return result;
    }
}