package ch4;

public class GCD {
    int loopCounter;

    public int gcdRecursive(int a, int b) {
        if (a == b) return a;

        if (a > b) return gcdRecursive(a - b, b);
        else return gcdRecursive(b - a, a);
    }

    public int gcdIterative(int a, int b) {
        loopCounter = 0;
        for (; a != b; loopCounter++) {
            if (a > b) a -= b;
            else b -= a;
        }
        System.out.println("loop count:" + loopCounter);
        return a;
    }

    //좀 조잡하긴한데.. 최적화해봄. 근데 왤케 확신이 없지..
    public int gcdOptimized(int a, int b) {
        loopCounter = 0;
        for (; a != b && a > 0 && b > 0; loopCounter++) {
            int 몫 = Math.max(a / b, b / a);
            if (a > b) a -= 몫 * b;
            else b -= 몫 * a;
        }
        System.out.println("loop count:" + loopCounter);
        return Math.max(a, b);
    }

    public int gcd(int a, int b) {
        for (; a % b != 0; loopCounter++) {
            if (b > a) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            int r = Remainder.getRemainder(a, b);
            a = b;
            b = r;
        }

        System.out.println("loop count:" + loopCounter);
        return b;
    }

    public int gcdSimple(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a % b == 0) return b;
        else return gcdSimple(b, a % b);
    }

}
