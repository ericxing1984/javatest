package test.eric.desginPattern.agent.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RecordHandler implements InvocationHandler {
    private  Person target;

    public RecordHandler(Person person) {
        this.target = person;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (proxy == null) {
            System.out.println("proxy is null");
        } else {
            System.out.println(proxy.getClass().getName());
            System.out.println(proxy.getClass().getInterfaces().length);
        }
        System.out.println("start to record...");
        method.invoke(target, args);
        System.out.println("end to record.");
        return null;
    }
}
