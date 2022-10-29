package ch4;

public class Remainder {
    public static int getRemainderNaive(int a, int b) {
        while (a > b) a -= b;
        return a;
    }

    //이해 안 되는데 걍 쓴거임
    public static int getRemainderFaster(int a, int b) {
        if (a < b) return a;
        if (a - b < b) return a - b; //재귀적 나머지 보조정리라고 함..
        a = getRemainderFaster(a, b + b);
        if (a < b) return a;
        return a - b;
    }

    // 난 그냥 이렇게 쓰련다
    public static int getRemainder(int a, int b) {
        return a % b;
    }

}
