import java.util.Scanner;

public class DecimalToNegBase {
    public static StringBuilder convert(int number) {
        if (number == 0) {
            return new StringBuilder("0");
        }
        StringBuilder x = new StringBuilder();
        var ost = 0;
        while(number != 0) {
            ost = number % (-10);
            number /= -10;
            if (ost < 0) {
                ost = 10 + ost;
                number += 1;
            }
            x.append(ost);
        }
        return new StringBuilder(x).reverse();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        var decimalNumber = in.nextInt();
        StringBuilder negBaseNumber = convert(decimalNumber);
        System.out.println("Число " + decimalNumber + " в системе счисления с основанием -10: " + negBaseNumber);
    }
}