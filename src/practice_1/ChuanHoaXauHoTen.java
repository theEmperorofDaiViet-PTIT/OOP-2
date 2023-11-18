package practice_1;

import java.util.Scanner;

public class ChuanHoaXauHoTen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test-->0) {
            String s = input.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String S = "";
            String[] a = s.split(" ");
            int length = 0;

            for(String mem: a) {
                if(mem.length() > 0)
                    length++;
            }

            int index = 0;
            for(String mem: a) {
                if(mem.length() > 0) {
                    if(index == 0 || index == length - 1){
                        S += mem.substring(0, 1).toUpperCase() + mem.substring(1) + " ";
                    }
                    else{
                        S += mem + " ";
                    }
                    index++;
                }
            }
            S = S.trim();
            System.out.println(S);
        }
    }
}
