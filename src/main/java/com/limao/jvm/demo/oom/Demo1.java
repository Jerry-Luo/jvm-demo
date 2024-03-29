package com.limao.jvm.demo.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 */
public class Demo1 {
    public static void main(String[] args) {
        while(true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Car.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    if (method.getName().equals("run")){
                        System.out.println("启动汽车之前，先进行自动安全检查。。。");
                    }
                    return methodProxy.invokeSuper(o, objects);
                }
            });

            Car car = (Car)enhancer.create();
            car.run();
        }
    }

    static class Car {
        public void run () {
            System.out.println("汽车启动，开始行驶。。。");
        }
    }
}
