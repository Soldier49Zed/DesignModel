package Proxy.DynaicProxy.CGlib;

/**
 * @Author: HouX
 * @Date: 2020/11/5
 * @Description:
 */

/*
 * @Title：通过反射构建对象，没有参数的类的反射生成的对象
 */
public class ReflectServiceImpl {
    public void sayHello(String name) {
        System.err.println("Hello " + name);
    }

    /*
     * @Description：生成对象并返回对象
     * @param：无
     * @return：ReflectServiceImpl对象
     */
    public ReflectServiceImpl getInstance(){
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("reflect.ReflectServiceImpl").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }
}

