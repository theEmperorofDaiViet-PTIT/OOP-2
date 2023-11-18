package practice_1;

import java.util.Scanner;

public class PhanSo {

    private long numerator;
    private long denominator;

    public PhanSo(){

    }

    public PhanSo(long a, long b){
        numerator = a;
        denominator = b;
    }
    public static long GCD(long a, long b) {
        while(b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static PhanSo getSimplicity(PhanSo f) {
        long gcd = GCD(f.numerator,f.denominator);
        if(f.numerator != 0) {
            f.numerator = (long) f.numerator / gcd;
            f.denominator = (long) f.denominator / gcd;
        }
        return f;
    }

    public static int getSign(PhanSo f) {
        if(f.numerator * f.denominator < 0)
            return -1;
        else if (f.numerator * f.denominator == 0)
            return 0;
        else
            return 1;
    }

    public static PhanSo getPositive(PhanSo f) {
        f.numerator = Math.abs(f.numerator);
        f.denominator = Math.abs(f.denominator);
        return f;
    }

    public static PhanSo substract(PhanSo f1, PhanSo f2) {
        PhanSo f3 = new PhanSo();
        f3.numerator = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        f3.denominator = f1.denominator * f2.denominator;

        return PhanSo.getSimplicity(f3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PhanSo f1 =  new PhanSo(input.nextLong(),input.nextLong());
        PhanSo f2 =  new PhanSo(input.nextLong(),input.nextLong());
        PhanSo f3 = PhanSo.substract(f1, f2);

        System.out.print((f3.numerator % f3.denominator == 0) ? f3.numerator / f3.denominator : f3.numerator + "/" + f3.denominator + " ");
        System.out.println();

        input.close();
    }
}
