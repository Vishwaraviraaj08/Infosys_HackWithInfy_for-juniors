package Q1;


import java.util.*;

public class q1ans{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(0);
        } else if (a + k <= b) {
            System.out.println(1);
        } else if (a - k >= b) {
            System.out.println(1);
        } else if (a + k <= r) {
            if (r - k >= b) {
                System.out.println(2);
            } else if (l + k <= b) {
                System.out.println(3);
            } else {
                System.out.println(-1);
            }
        } else if (a - k >= l) {
            if (l + k <= b) {
                System.out.println(2);
            } else if (r - k >= b) {
                System.out.println(3);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }
}