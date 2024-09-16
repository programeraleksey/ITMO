package org.example;

public class lab1 {
    public static double matrix(int a, int b, double[] sp) {
        return switch (a) {
            case 9 -> Math.cos(Math.atan(Math.sin(sp[b])));
            case 3, 5, 11 -> Math.tan(Math.cbrt(Math.tan(sp[b])));
            default -> Math.cos(Math.pow(Math.pow(2 * sp[b], 3) + Math.PI, 3) / 4);
        };
    }
    public static void ex(double[][] k) {
        for (double[] n: k) {
            for (double m: n) {
                System.out.format("%10.4f", m);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] r1 = new int[(15 - 3) / 2 + 1];
        int i = 0;
        for (int n = 15; n >= 3; n--) {
            if (n % 2 == 1) {
                r1[i] = n;
                i++;
            }
        }
        double[] x = new double[12];
        for (var l = 0; l < 12; l++) {
            x[l] = (Math.random() * 12 - 9);
        }
        double[][] r = new double[7][12];
        for (var n = 0; r.length > n; n++) {
            for (var m = 0; r[0].length > m; m++) {
                r[n][m] = matrix(n, m, x);
            }
        }
        ex(r);
    }
}