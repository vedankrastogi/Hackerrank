import java.util.*;
import java.io.*;

class Solution1{
    public static void main(String []argh){
        int s;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int q=0;
            for(int j=0;j<n;j++){
                q= (int) (q+Math.pow(2,j)*b);
                s=a+q;
                System.out.print(s+" ");

            }
            System.out.println();



        }
    }
}