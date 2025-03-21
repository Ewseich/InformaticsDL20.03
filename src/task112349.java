import java.util.Scanner;
public class task112349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int count = 0;
        String tmp = sc.nextLine();
        while (sb.indexOf(tmp) != -1) {
            int ind = sb.indexOf(tmp);
            sb.replace(ind, ind + tmp.length(), "");
            count++;
        }
        System.out.println(count);
    }
}