import java.util.StringTokenizer;  

public class MyStringTokenizer {  
    public static void main(String args[]) {  
        StringTokenizer s1 = new StringTokenizer("Welcome to VJIT");  
        while (s1.hasMoreTokens()) {  
            System.out.println(s1.nextToken());  
        }  
        StringTokenizer s2 = new StringTokenizer("Hello;IT", ";");  
        while (s2.hasMoreTokens()) {  
            System.out.println(s2.nextToken());  
        }
    }
}