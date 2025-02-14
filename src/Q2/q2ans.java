package Q2;
import java.util.*;

public class q2ans {

    public static int getDistances(int n, int[] a) {
        int[] prefix = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }

        int[] distances = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int j = 0; j < n; j++) {
            while (!stack.isEmpty()) {
                int i = stack.peekLast();
                boolean valid = true;

                for (int k = i; k < j; k++) {
                    if (rangeSum(prefix, i, k) < a[k + 1]) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    distances[j] = j - i;
                    break;
                } else {
                    stack.pollLast();
                }
            }
            stack.addLast(j);
        }

        return Arrays.stream(distances).sum();
    }

    private static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0) return prefix[r];
        return prefix[r] - prefix[l - 1];
    }
}
