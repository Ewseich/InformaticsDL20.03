import java.util.Scanner;
public class task112415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.nextLine()), sb1 = new StringBuffer(sb);
        int ind, i = 1;
        if (sb.indexOf("+") < sb.indexOf("-")) ind = sb.indexOf("+");
        else ind = sb.indexOf("-");
        int result = Integer.parseInt(sb.delete(ind, sb.length()).toString());
        sb1.delete(0, ind);
        while (sb1.indexOf("+") > -1 || sb1.indexOf("-") > -1) {
            StringBuffer num = new StringBuffer();
            while (i < sb1.length() && sb1.charAt(i) != '-' && sb1.charAt(i) != '+') {
                num.append(sb1.charAt(i));
                i++;
            }

            if (sb1.charAt(0) == '-') result -= Integer.parseInt(num.toString());
            else result += Integer.parseInt(num.toString());
            sb1.delete(0, num.length()+1);

            i = 1;
        }

        System.out.println(result);
    }
}
