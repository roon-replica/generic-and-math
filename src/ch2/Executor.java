package ch2;

public class Executor {
    public static void main(String[] args) {
        var multiplier = new Multiply();
        var multiplyByAdding = multiplier.multiplyByAdding(13, 15);
        System.out.println(multiplyByAdding);

        var multiplyByEgyptian = multiplier.multiplyByEgyptian(13, 15);
        System.out.println(multiplyByEgyptian);

        var multiplyByAccumulation = multiplier.multiplyWithAccumulation(0, 13, 15);
        System.out.println(multiplyByAccumulation);

        var multiplyWithNoRecursion = multiplier.multiplyWithNoRecursion(0, 13, 15);
        System.out.println(multiplyWithNoRecursion);


    }
}
