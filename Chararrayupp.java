import java.util.*;
public class Chararrayupp {
    public static void main(String[]args){
        String a="PUSHPA";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++){
            c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
    }
    
}
/*  [1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0] */