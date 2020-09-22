package jobTest;

public class Example extends Thread {

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.start();
        System.out.println("main");
    }
}
