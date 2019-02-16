import java.util.*;

public class Goki{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n+1];
       for(int i=0;i<=n;i++){
            a[i]=in.nextInt();
       }
       for(int i=1;i<=n;i++){
           if(a[i]>=a[0])
            System.out.println("YES");
           else
            System.out.println("NO");
       }
    }
}
