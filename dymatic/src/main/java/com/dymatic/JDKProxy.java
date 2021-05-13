package com.dymatic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.aopalliance.intercept.Invocation;

public class JDKProxy {
    private Object target;

    

    public JDKProxy(Object target) {
        this.target = target;
    }



    public Object getProxy() {
        ClassLoader loader = this.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // TODO Auto-generated method stub
                // System.out.println("invoke...");
                Object object = method.invoke(target, args);
                return object;
            }
            
        };
        Object proxy = Proxy.newProxyInstance(loader, interfaces, invocationHandler);
        return proxy;
    }
}
