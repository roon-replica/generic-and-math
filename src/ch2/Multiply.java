package ch2;

public class Multiply {

    // 곱셈을 무언가를 몇 번 더하는 것으로 생각할 때.
    public int multiplyByAdding(int base, int times) { // O(n)
        if (times == 1) return base;
        else return multiplyByAdding(base, times - 1) * base;
    }

    /*
     좀 더 최적화한 버전.
     기존의 방식: ((a+a)+a)+a -> 덧셈을 n-1번 해야 함.
     개선된 방식: (a+a)+(a+a) -> 덧셈을 (log(n) + binary 표현에서 1의 개수)번만 하면 됨..!
     8*a = (8/2)*(a+a) = 4*(2a) = (4/2) * (2a+2a) = 2*4a = (2/2) * (4a+4a) = 1*8a = 8a
     7*a = (7/2)*(a+a)+a = 3*2a +a = (3/2) * (2a+2a) +a+2a = 1 *4a +a+2a = 4a+3a = 7a
     */
    public int multiplyByEgyptian(int base, int times) { // O(log n)
        if (times == 1) return base;

        int result = multiplyByEgyptian(doubling(base), half(times));

        if (isOdd(times)) {
            result += base;
        }

        return result;
    }

    private int doubling(int n) {
        return n * 2;
    }

    private int half(int n) {
        return n / 2;
    }

    private boolean isOdd(int times) {
        return times % 2 == 1;
    }



}
