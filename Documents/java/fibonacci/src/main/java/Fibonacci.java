package main.java;

public class Fibonacci {

    public static void main(String[] args) {
        long[] seq = sequence(100);
        System.out.println(seq);
    }

    public static long[] sequence(int n) {
        long[] array = new long[n];
        if (n == 1) {
            array[0] = 0;
            return array;
        } else if (n == 2) {
            array[0] = 0;
            array[1] = 1;
            return array;
        }
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i < n; i++) {
            array[i] = array[i -1] + array[i -2];
        }
        return array;
    }
}
