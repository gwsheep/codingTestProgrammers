package Java.Lv0;

import java.util.Scanner;

public class lv1_001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.length()>=1 && a.length()<=1000000){
            System.out.println(a);
        }
    }
}
