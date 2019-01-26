import java.util.*;

public class CountDivisors{
    public static void main(String []args){
        // int i,l,k;
        Scanner in=new Scanner(System.in);
    //   int a[]=new int[3];
    //   for(int j=0;j<3;j++){
    //       a[j]=in.nextInt();
    //   }
    //   i=a[0];l=a[1];k=a[2];
    int i = in.nextInt();
    int l = in.nextInt();
    int k = in.nextInt();
    
    in.close();
      int count=0;
      while(i<=l){
          if((i%k)==0){
              count++;
          }
          if( i != l && ((l%k)==0) ){
              count++;
          }
          i++;
          l--;
      }
    
    // for (int n=i; n<=l; n++) {
    //     if((n%k) == 0)
    //         count++;
    // }
      System.out.println(count);
    }
}
