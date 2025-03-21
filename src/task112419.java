import java.util.Arrays;
import java.util.Scanner;
public class task112419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = Character.digit(ch, 10);
            if (n >= 0) {
                result.append(n);
            }
        }
        result.getChars(0, result.length(), result.toString().toCharArray(), 0);
        int[] res = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            res[i] = result.charAt(i) - '0';
        }
        Arrays.sort(res);
        StringBuffer finalresult = new StringBuffer();
        for (int i = 0; i < result.length(); i++) {
            finalresult.append(res[i]);
        }
        finalresult.reverse();
        System.out.println(finalresult);
    }
}

