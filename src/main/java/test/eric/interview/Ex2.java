package test.eric.interview;

class Father {
    Father(){
        System.out.println("Father");
    }
}
public class Ex2 extends Father{
    public Ex2() {
        System.out.println("Children");
        //super();
    }

    public static void main(String[] args) {
        Ex2 c = new Ex2();
        int i = 20;
        String s = (i<10)?"winter":(i>30)?"summer":"spring";
        System.out.println(s);
    }
}
