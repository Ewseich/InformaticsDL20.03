import java.util.Arrays;
import java.util.Scanner;
public class task112411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        String[] mass = new String[10000], full = new String[10000];
        while (sc.hasNext()) {
            String a = sc.nextLine();
            if (a.contains("0")) break;
            full[l] = a.substring(0, a.indexOf(" ") + 1);
            mass[l] = a.substring(a.indexOf(" ") + 1);
            l++;
        }
        String[] sortmass = new String[l];
        for (int i = 0; i < l; i++) {
            sortmass[i] = mass[i] + " " + full[i];
        }
        Arrays.sort(sortmass);
        int k = 0;
        for (int i = 0; i < l; i++) {
            String s = sortmass[i];
            System.out.println((k+1) +"." + sortmass[i].substring(s.length()-6) + s.substring(0, s.length()-6));
            k++;
        }

    }
}