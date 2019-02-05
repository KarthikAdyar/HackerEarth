import java.util.*;

public class Maze{
    public static void main(String [] args) throws Exception{
        Scanner in=new Scanner(System.in);
        int x=0,y=0;
        String str=in.nextLine();
       
        for(int i=0;i<str.length();i++){
           char str1=str.charAt(i);
            if(str1=='L'){
                x--;
            }
            if(str1=='R'){
                x++;
            }
            if(str1=='U'){
                y++;
                
            }
            if(str1=='D'){
                y--;
            }
        }
        System.out.println(x+" "+y);
        
    }
}
