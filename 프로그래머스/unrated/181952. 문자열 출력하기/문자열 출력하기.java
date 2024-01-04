import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int str = a.length();
        if(1 <= str && str <= 100000) {
        	System.out.println(a);
        }
    }
}