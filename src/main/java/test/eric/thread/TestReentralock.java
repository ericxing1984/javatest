package test.eric.thread;

public class TestReentralock {
    public synchronized void parent() {
        System.out.println("this is parent");
        child();
    }

    public synchronized void child() {
        System.out.println("this is child");
    }

    public static void main(String[] args) {
        TestReentralock test = new TestReentralock();
        test.parent();
    }
}
