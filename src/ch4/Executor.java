package ch4;

public class Executor {
    public static void main(String[] args) {
        var gcdUtil = new GCD();
        var gcd = gcdUtil.gcdRecursive(154, 42);
        System.out.println(gcd);

        var gcd2 = gcdUtil.gcdIterative(154, 42);
        System.out.println(gcd2);

        var gcd3 = gcdUtil.gcdOptimized(154, 42);
        System.out.println(gcd3);

        var gcd5 = gcdUtil.gcd(154, 42);
        System.out.println(gcd5);

        var gcd6 = gcdUtil.gcdSimple(154, 42);
        System.out.println(gcd6);
    }
}
