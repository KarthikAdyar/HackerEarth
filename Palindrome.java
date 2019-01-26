import java.util.*;

public class Palindrome{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        String s=in.next();
        char s1[] =s.toCharArray();
        int i=0,flag=0,j=s.length()-1;
        while(true){
            if(s1[i]!=s1[j]){
                flag=1;
                break;
            }
            i++;j--;
            if(i>s.length()-1 || j<0){
                break;
            }
        }
        if(flag==0){
            System.out.println("YES");
        }else if(flag==1){
            System.out.println("NO");
        }
    }
}
