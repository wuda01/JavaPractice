package jobTest;

public class JobTest25 {

    public static void main(String[] args) {
        int x;
        int y;
        for (x=1, y=1; x<=100; x++) {
            if (y>=20){
                break;
            }
            if (y%3==1){
                y += 3;
                continue;
            }
            y -= 5;
        }
        System.out.println("x="+x+",y="+y);
    }
}
