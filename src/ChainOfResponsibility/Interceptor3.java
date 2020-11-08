package ChainOfResponsibility;

import Proxy.DynaicProxy.Jdk_Interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description: 责任链模式
 */
public class Interceptor3 implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object args) {
        System.out.println("【拦截器3】的before方法");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object args) {

    }

    @Override
    public void after(Object proxy, Object target, Method method, Object args) {
        System.out.println("【拦截器3】的after方法");
    }
}
