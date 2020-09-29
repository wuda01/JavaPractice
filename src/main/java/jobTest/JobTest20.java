package jobTest;


import java.util.Scanner;
public class JobTest20 {

    static int max=50;                   	//定义默认大小
    static int[] x=new int[max];         	//解向量
    static int[][] map=new int[max][max];	//图的邻接矩阵
    static int sum=0;                    	//记录解的个数
    static int n,m,edge;                    //n 为节点个数   m是色号种数  edge是边数

    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入节点数:");
        n=sc.nextInt();
        System.out.println("请输入颜色数:");
        m=sc.nextInt();
        System.out.println("请输入无向图的邻接矩阵:");
        creatMap();
        backTrack(1);
        sc.close();
    }


    /*创建邻接矩阵*/
    private static void creatMap() {
        Scanner sc=new Scanner(System.in);
        int u,v;
        System.out.println("请输入边数:");
        edge=sc.nextInt();
        System.out.println("请依次输入有边相连的两个节点u 和v ,用空格分开:");
        for(int i=1;i<=edge;i++) {                           //给邻接矩阵赋值
            u=sc.nextInt();
            v=sc.nextInt();
            map[u][v]=map[v][u]=1;                       //相连点赋值为1
        }
    }


    /*搜索函数*/
    private static void backTrack(int t) {                       // t:第t层扩展
        if(t>n) {     //达到叶子节点  记录可行解 且sum++
            sum++;
            System.out.println("第"+sum+"种方案:");
            for(int i=1;i<=n;i++) {
                System.out.print(x[i]+" ");          //打印出第sum种方案具体解向量
            }
            System.out.println();
        }else {                                              //每个节点尝试m种颜色  按顺序尝试
            for(int i=1;i<=m;i++) {
                x[t]=i;
                if(ok(t))                            //判断是否与前t-1个节点是否相连却不同色
                    backTrack(t+1);              // yes的话则  继续搜索下一扩展节点   no则继续循环
            }
        }
    }


    /*约束条件---判断是否与前t-1个节点是否相连却不同色*/

    private static boolean ok(int t) {
        for(int j=1;j<t;j++) {                           //与前t-1个节点进行比较
            if(map[t][j]==1) {                       //t与j相连
                if(x[t]==x[j])			 //判断色号是否相同   若同  则返回false
                    return false;
            }
        }
        return true;
    }
}
