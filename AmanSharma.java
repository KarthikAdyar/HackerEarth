import java.util.*;

public class AmarSharma{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int d=in.nextInt();
        int count=0;
        while(d--!=0){
            int r=in.nextInt();
            int x=in.nextInt();
            if((44.0/7)*r<=100*x)
                count++;
        }
         System.out.println(count);
        
    }
   
}
