package ch2;

public class Multiply {

    // 곱셈을 무언가를 몇 번 더하는 것으로 생각할 때.
    public int multiplyByAdding(int base, int times) { // O(n)
        if (times == 1) return base;
        else return multiplyByAdding(base, times - 1) * base;
    }




}
