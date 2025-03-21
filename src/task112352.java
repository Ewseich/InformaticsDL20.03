import java.math.BigInteger;
import  java.util.Scanner;
public class task112352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer result = new StringBuffer();
        StringBuffer num = new StringBuffer(s);
//        while (!el.equals(BigInteger.ZERO)) {
//            num.append(el.remainder(BigInteger.TWO));
//            el = el.divide(BigInteger.TWO);
//        }
//        num.reverse();
//        result.append(num);
        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case '-': result.append("-"); break;
                case 'A': result.append("1010"); break;
                case 'B': result.append("1011"); break;
                case 'C': result.append("1100"); break;
                case 'D': result.append("1101"); break;
                case 'E': result.append("1110"); break;
                case 'F': result.append("1111"); break;
                case '0': result.append("0000"); break;
                case '1': result.append("0001"); break;
                case '2': result.append("0010"); break;
                case '3': result.append("0011"); break;
                case '4': result.append("0100"); break;
                case '5': result.append("0101"); break;
                case '6': result.append("0110"); break;
                case '7': result.append("0111"); break;
                case '8': result.append("1000"); break;
                case '9': result.append("1001"); break;
            }

        }
        if (result.indexOf("0") == 1 + result.indexOf("-")) result.delete(result.indexOf("0"), result.indexOf("1"));
        System.out.println(result);



    }
}
