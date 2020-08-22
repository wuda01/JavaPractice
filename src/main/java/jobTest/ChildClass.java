package jobTest;

import jobTest.FatherClass;
public class ChildClass extends FatherClass {

    public ChildClass() {
        System.out.println("ChildClass Create");
    }

    public static void main(String[] args) {
        FatherClass fo = new FatherClass();
        ChildClass oo = new ChildClass();
    }
}
