package ch7;

public class GenericMultiply {
    // non generic.
    public static int multiplyIntType(int r, int n, int a) {
        for (; ; ) {
            if (n % 2 == 1) {
                r += a;
                if (n == 1) {
                    return r;
                }
            }

            n /= 2;
            a += a;
        }
    }

    //generic method
    public static <SemiGroup extends Number, Monoid extends Integer> double multiplyGeneric(SemiGroup r0, Monoid n0, SemiGroup a0) {
        //이러면 generic 쓰는 의미가 있나..?
        double r = r0.doubleValue();
        double a = a0.doubleValue();
        int n = n0.intValue();

        for (; ; ) {
            if (n % 2 == 1) {
                r += a;
                if (n == 1) {
                    return r;
                }
            }

            n /= 2;
            a += a;
        }
    }

    public static void main(String[] args) {
        var intResult = multiplyIntType(0, 11, 11);
        System.out.println(intResult);

        var genericResult = multiplyGeneric(0, 11, 11);
        System.out.println(genericResult);
    }
}
