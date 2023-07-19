
import java.util.Scanner;

public class LongestPalindrome{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            int left = i;
            int right = i;
            while(left >= 0 && s.charAt(left) == c) left --;
            while(right < s.length() && s.charAt(right) == c) right ++;
            while(left >= 0 && right < s.length()) {
                if(s.charAt(left) != s.charAt(right)) break;
                left --;
                right ++;
            }
            left += 1;
            if(end - start < right - left) {
                start = left;
                end = right;
            }
        }
        return s.substring(start, end);
    }

}