import java.util.Scanner;
import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();

        String result = convertToFraction(input);
        System.out.println(result);
    }

    private static String convertToFraction(String input) {

        int dotIndex = input.indexOf('.');
        int openBracket = input.indexOf('(');
        int closeBracket = input.indexOf(')');

        String integerPartStr = input.substring(0, dotIndex);
        String nonPeriodicStr = input.substring(dotIndex + 1, openBracket);
        String periodicStr = input.substring(openBracket + 1, closeBracket);

        BigInteger a = new BigInteger(integerPartStr);
        boolean negative = a.compareTo(BigInteger.ZERO) < 0;
        a = a.abs();

        BigInteger N = nonPeriodicStr.isEmpty() ? BigInteger.ZERO : new BigInteger(nonPeriodicStr);
        BigInteger c = new BigInteger(periodicStr);

        int k = nonPeriodicStr.length();
        int m = periodicStr.length();

        BigInteger ten = BigInteger.TEN;
        BigInteger tenPowK = ten.pow(k);
        BigInteger tenPowM = ten.pow(m);
        BigInteger tenPowM_minus_1 = tenPowM.subtract(BigInteger.ONE);

        BigInteger denominator = tenPowK.multiply(tenPowM_minus_1);
        BigInteger numeratorWithoutInteger = N.multiply(tenPowM_minus_1).add(c);
        BigInteger numerator = a.multiply(denominator).add(numeratorWithoutInteger);

        if (negative) {
            numerator = numerator.negate();
        }

        BigInteger gcd = numerator.gcd(denominator);
        numerator = numerator.divide(gcd);
        denominator = denominator.divide(gcd);

        return numerator + "/" + denominator;
    }
}