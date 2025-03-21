import java.util.Scanner;
public class task112409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] mass = new String[n];
        for (int i = 0; i < n; i++) {
            String trash = sc.next();
            mass[i] = sc.next();
        }
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                StringBuffer a = new StringBuffer(mass[j]);
                StringBuffer b = new StringBuffer(mass[j + 1]);
                if (a.toString().compareTo(b.toString()) > 0) {
                    flag = true;
                    mass[j] = b.toString();
                    mass[j + 1] = a.toString();
                }
            }
            if (!flag) {break;}
        }
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) +". " + mass[i]);
        }
    }
}
