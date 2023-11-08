package Java.Lv0;

import java.util.Scanner;
public class lv1_002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(restrict(a) == a && restrict(b) == b){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

    public static int restrict(int x){
        if(x >= -100000 && x <= 100000){
            return x;
        } else {
            return 0;
        }
    }

}
