package practice_1;

import java.util.Calendar;
import java.util.Scanner;

public class Sinhvien {

    private String id;
    private String name;
    private int age;
    private double mark1;
    private double mark2;

    public void input(){
        Scanner input = new Scanner(System.in);
        this.id = input.nextLine();
        this.name = input.nextLine();
        this.age = input.nextInt();
        this.mark1 = input.nextDouble();
        this.mark2 = input.nextDouble();
    }

    public void formatID(){
        this.id = this.id.toUpperCase();
    }

    public int getBirthYear(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.age;
    }

    public double getGPA(){
        return (this.mark1 + 2 * this.mark2) / 3;
    }

    public void out(){
        formatID();
        System.out.printf("%s %s %d %.1f", this.id, this.name, getBirthYear(), getGPA());
    }

    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}
