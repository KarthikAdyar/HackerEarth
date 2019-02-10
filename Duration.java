import java.util.*;

public class Duration{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int hr1[]=new int[n+1];
        int min1[]=new int[n+1];
        int hr2[]=new int[n+1];
        int min2[]=new int[n+1];
        for(int i=0;i<n;i++){
            hr1[i]=in.nextInt();
            min1[i]=in.nextInt();
            hr2[i]=in.nextInt();
            min2[i]=in.nextInt();
        }
        
        for(int i=0;i<n;i++){
              int mins1=hr1[i]*60;
            mins1=mins1+min1[i];
            int mins2=hr2[i]*60;
            mins2=mins2+min2[i];
             if(hr1[i]>hr2[i]){
                if(mins1>mins2){
                    mins1=60-mins1;
                    mins2=min1[i]+mins2;
                    int h=12-(hr1[i]-hr2[i])-1;
                    System.out.println(h+" "+mins2);
                    break;
                }
                mins1=mins1-mins2;
                int h=(mins1/60),m=(mins1%60);
                h=12-h-1;m=60-m;
                System.out.println(h+" "+m);
                
            }
           
            mins2=mins2-mins1;
            System.out.println(mins2/60+" "+mins2%60);
        }
        
    }
}
