import java.util.Scanner;
public class task112350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String replacer = sc.nextLine();
        int ind = sb.lastIndexOf(".");
        if (ind == -1){
            sb.append(".");
            sb.append(replacer);
        }
        else sb.replace(ind, sb.length(), "."+replacer);
        System.out.println(sb);
    }
}
