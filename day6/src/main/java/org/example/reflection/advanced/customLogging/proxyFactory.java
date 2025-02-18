package org.example.reflection.advanced.customLogging;

import java.lang.reflect.Proxy;

public class proxyFactory {
    public static Object createProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingHandler(target)
        );
        
    }

}
