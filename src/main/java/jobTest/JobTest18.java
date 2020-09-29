package jobTest;

import java.util.ArrayList;
import java.util.List;

public class JobTest18 {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

        //getUperNumber(name);
        getUperNumber(age);
        getUperNumber(number);

    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data:" + data.get(0));
    }
}
