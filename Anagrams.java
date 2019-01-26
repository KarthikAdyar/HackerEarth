import java.util.*;
import java.lang.Math.*;
public class Anangrams{
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
       while(true){
        String s1,s2;
        s1=in.next();
        s2=in.next();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr2[s2.charAt(i)-'a']++;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum += Math.abs(arr1[i]-arr2[i]);
        }
        
        System.out.println(sum);
        t--;
        if(t==0)
            break;
}
        
    }}
