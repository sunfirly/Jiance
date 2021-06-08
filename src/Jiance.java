import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Jiance {
    public static void main(String[] args) {
        int n,k,t,xl,yd,xr,yu;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        t=sc.nextInt();
        xl=sc.nextInt();
        yd=sc.nextInt();
        xr=sc.nextInt();
        yu=sc.nextInt();
        excise(n,k,t,xl,yd,xr,yu);
    }
    public static  void excise(int n,int k,int t, int xl,int yd,int xr,int yu) {
        int[] x = new int[t];
        int[] y = new int[t];
        Scanner sc = new Scanner(System.in);
        int c=0;
        int a = 0, b = 0;
        for (int e = 0; e < n; e++) {
            for (int i =0; i < t; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                c++;
                if (x[i] >= xl && x[i] <= xr && y[i] >= yd && y[i] <= yu) {
                    a++;
                    if (i != 0 && x[i - 1] >= xl && x[i - 1] <= xr && y[i - 1] >= yd && y[i - 1] <= yu) {
                        b++;
                        a--;
                        break;
                    }
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
