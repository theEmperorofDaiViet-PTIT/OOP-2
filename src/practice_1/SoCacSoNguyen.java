package practice_1;

import java.util.Scanner;

public class SoCacSoNguyen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '3' || s.charAt(i) == '5'){
                count++;
            }
        }
        System.out.println((count == 3 || count == 5) ? "YES" : "NO");
    }
}
