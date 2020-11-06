package Proxy.DynaicProxy.Jdk_Interceptor;

import java.lang.reflect.Method;

/**
 * @Author: HouX
 * @Date: 2020/11/5
 * @Description: 拦截器
 */
public interface Interceptor {
    /**
     * 三个方法通用
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method method方法
     * @param args args运行方法参数
     * @return
     */


    //返回true时，反射真实对象的方法，返回为false时，调用around方法.
    boolean before(Object proxy, Object target, Method method, Object args);

    void around(Object proxy, Object target, Method method, Object args);

    //在before之后或者around方法之后，调用after
    void after(Object proxy, Object target, Method method, Object args);
}
