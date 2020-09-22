package jobTest;

public class JobTest19 {

    public static void local(double n, int m, double r){
        double row=n, col=n;
        int flag = 0;
        double mod = r%(n*4) / n;
        double div = r%(n*4) % n;
        for (int i=0; i<m; i++) {
            if (flag==0) {
                if (mod==0) {
                    System.out.println(div+" "+0);
                    flag = 0;
                } else if (mod==1) {
                    System.out.println(n+" "+div);
                    flag = 1;
                } else if (mod==2) {
                    System.out.println((n-div)+" "+n);
                    flag = 2;
                } else {
                    System.out.println(0+" "+(n-div));
                    flag = 3;
                }
            }
        }
    }

    public static void main(String[] args) {
        local(3,5,5);
    }
}
