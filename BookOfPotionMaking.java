import java.util.*;

public class BookOfPotionMaking{
    public static void main(String []args)throws Exception{
        Scanner in=new Scanner(System.in);
        String s=in.next();
        long sum=0;
        char []arr=s.toCharArray();
        if(arr.length!=10){
            System.out.println("Illegal ISBN");
            System.exit(0);
        }
        for(int i=1;i<=arr.length;i++){
            sum=sum+(i*(arr[i-1]-48));
        }
        if(sum%11==0){
            System.out.println("Legal ISBN");
        }else{
            System.out.println("Illegal ISBN");
        }
       
    }
}
