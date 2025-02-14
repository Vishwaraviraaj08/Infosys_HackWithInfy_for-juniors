package Q3;

import java.util.*;
public class q3ans {
    public int findMinimum(int N, int c, int[] a){
        int summ = Arrays.stream(a).sum();
        if (summ > c) return 0;

        int x = 0, cur = 0;
        for(int i : a){
            cur += i;
            if (cur <= 0) x = Math.max(x, -cur);
        }
        return x;
    }
}
