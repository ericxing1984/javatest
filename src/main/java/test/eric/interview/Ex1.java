package test.eric.interview;
class A {
    public static void prt() {
        System.out.println("1");
    }
    public A(){
        System.out.println("A");
    }
}
public class Ex1 extends A{
    public static void prt() {
        System.out.println("2");
    }
    public Ex1() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new Ex1();
        a = new A();
    }
}
