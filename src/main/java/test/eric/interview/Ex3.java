package test.eric.interview;

public class Ex3 {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(!(a==b)&&!a.equals(b));
        System.out.println(!(!(a==b)&&!a.equals(b)));
    }
}
