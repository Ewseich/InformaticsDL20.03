import java.util.Scanner;
public class task112348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), tmp = sc.nextLine(), replacer = sc.nextLine();
        s = s.replaceAll(tmp, replacer);
        System.out.println(s);
    }
}
