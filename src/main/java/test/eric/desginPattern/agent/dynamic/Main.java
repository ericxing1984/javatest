package test.eric.desginPattern.agent.dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws Exception{
        Person person = (Person) Proxy.newProxyInstance(
                Main.class.getClassLoader(), Chinese.class.getInterfaces(), new RecordHandler(new Chinese()));
        person.speak();
        FileOutputStream os = new FileOutputStream("D:\\$Proxy0.class");
        os.write(ProxyGenerator.generateProxyClass("$Poxy0", new Class[]{person.getClass()}));
        os.close();
    }
}
