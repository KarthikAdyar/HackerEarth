import java.util.*;

public class Seats{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        //no.of seats
        int t=in.nextInt();
        int t1[]=new int[t+1];
       for(int i=0;i<t;i++){
           t1[i]=in.nextInt();
       }
       int k=0;
       for(int i=0;i<t;i++){
          int t2[]=new int[t+1];
          t2[i]=t1[i];
          t1[i]=t1[i]%12;
           if(t1[i]==1||t1[i]==6||t1[i]==7||t1[i]==12){
               k=1;
           }
           if(t1[i]==2||t1[i]==5||t1[i]==8||t1[i]==11){
               k=2;
           }
           if(t1[i]==3||t1[i]==4||t1[i]==9||t1[i]==10){
               k=3;
           }
           while(k==1){
              // t2[i]=t2[i]%12;
               if((t2[i]%12)==1){
                    System.out.println((t2[i]+11)+" "+"WS");
                    break;
               }
               if((t2[i]%12)==0){
                    System.out.println((t2[i]-11)+" "+"WS");
                    break;
               }
               if((t2[i]%12)==6){
                   System.out.println((t2[i]+1)+" "+"WS");
                   break;
               }
               if((t2[i]%12)==7){
                   System.out.println((t2[i]-1)+" "+"WS");
                   break;
               }
           }
            while(k==2){
              // t2[i]=t2[i]%12;
               if((t2[i]%12)==2){
                    System.out.println((t2[i]+9)+" "+"MS");
                    break;
               }
               if((t2[i]%12)==5){
                    System.out.println((t2[i]+3)+" "+"MS");
                    break;
               }
               if((t2[i]%12)==8){
                   System.out.println((t2[i]-3)+" "+"MS");
                   break;
               }
               if((t2[i]%12)==11){
                   System.out.println((t2[i]-9)+" "+"MS");
                   break;
               }
           }
            while(k==3){
               //t2[i]=t2[i]%12;
               if((t2[i]%12)==3){
                    System.out.println((t2[i]+7)+" "+"AS");
                    break;
               }
               if((t2[i]%12)==10){
                    System.out.println((t2[i]-7)+" "+"AS");
                    break;
               }
               if((t2[i]%12)==4){
                   System.out.println((t2[i]+5)+" "+"AS");
                   break;
               }
               if((t2[i]%12)==9){
                   System.out.println((t2[i]-5)+" "+"AS");
                   break;
               }
           }
           
           
       }
       
        
        
    }
}
