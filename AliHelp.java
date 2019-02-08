import java.util.*;

public class AliHelp{
    public static void main(String args[]) throws Exception{
        Scanner in=new Scanner(System.in);
        String s=in.next();int flag=0;
        char arr[]=s.toCharArray();
        int i=0;
        while(i<arr.length-1){
            if(i==0||i==3||i==4||i==7){
                if((arr[i]+arr[i+1])%2!=0){
                    flag=1;
                    break;
                }
            }
            if(i==2){
                if((arr[i]=='A')||(arr[i]=='E')||(arr[i]=='I')||(arr[i]=='O')||(arr[i]=='U')||(arr[i]=='Y'))
                flag=1;
                
            }
            i++;
        }
       
       if(flag==0){
           System.out.println("valid");
       }else{
           System.out.println("invalid");
       }
        
    }
}
