package othercode;

public class threadTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "线程运行开始!");
        Thread thread1 = new Thread();
        thread1.setName("线程 B");
        thread1.join();
        System.out.println("这时 thread1 执行完毕之后才能执行主线程");
    }
}
