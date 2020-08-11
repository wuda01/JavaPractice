package offercode.Others;

public class offer_00 {

    /**
     * 单例设计模式
     * 设计一个类只能生成该类的一个实例
     */

    private static class SingletonHodler {
        private static offer_00 ourInstance = new offer_00();
    }
    public static offer_00 getInstance() {
        return SingletonHodler.ourInstance;
    }
    private offer_00() {

    }
}
