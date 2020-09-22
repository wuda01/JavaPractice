package jobTest;


class B extends A {
    void test(){
        super.test();
        System.out.println("B");
    }

}

public class A {

    public static void main(String[] args) {
      B b = new B();
      b.test();
    }

    void test(){
        System.out.println("A");
    }
}

