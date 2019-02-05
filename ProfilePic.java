import java.util.*;

public class ProfilePic{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int n=in.nextInt(),w,h;
        for(int i=0;i<n;i++){
             w=in.nextInt();
             h=in.nextInt();
             if((w<l||h<l)) {
                System.out.println("UPLOAD ANOTHER");
                continue;
                }
            if((w==l && h==l)||(w==h)){
                System.out.println("ACCEPTED");
                continue;
                
            }else{
                System.out.println("CROP IT");
                continue;
        
    }
}
}
}
