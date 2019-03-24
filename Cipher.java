import java.util.*;

public class Cipher{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        String s1=new String();
        s1=in.nextLine();
        char [] a=s1.toCharArray();
        int n=in.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90){
               a[i]+=n;
                while(a[i]>90){
                   a[i]=(char)(a[i]-26);
                }
                
            }
            if(a[i]>=97 && a[i]<=122){
                a[i]+=n;
                while(a[i]>122){
                    a[i]=(char)(a[i]-26);
                }
            }
            if(a[i]>=48 && a[i]<=57){
                a[i]+=n;
                while(a[i]>57){
                    a[i]=(char)(a[i]-10);
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
    }
}
