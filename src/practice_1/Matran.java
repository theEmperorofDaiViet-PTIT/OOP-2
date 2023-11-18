package practice_1;

import java.util.Scanner;

public class Matran {

    private int[][] a;

    public Matran(int n){
        this.a =  new int[n][n];
    }

    public Matran(int[][] a){
        this.a = a;
    }

    public int[][] getMatran(){
        return this.a;
    }

    public int getKT(){
        return this.a.length;
    }

    public void input(Scanner in){
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a.length; j++){
                this.a[i][j] = in.nextInt();
            }
        }
    }

    public void out(){
        for(int i = 0; i < this.a.length; i++){
            for(int j = 0; j < this.a.length; j++){
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matran tich(int[][] b){
        Matran res = new Matran(this.getKT());
        for(int i = 0 ; i < res.getKT(); i++){
            for(int j = 0; j < res.getKT(); j++){
                for(int k = 0; k < this.getKT(); k++){
                    res.a[i][j] += this.a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran t=m.tich(b.getMatran());
        //viet ra ma tran tich
        t.out();
    }
}
