import java.util.*;
public class Chararraylow {
    public static void main(String[]args){
        String a="pushpa";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++){
            c[((int)(a.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c));
    }
    
}
/* [1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0] */
