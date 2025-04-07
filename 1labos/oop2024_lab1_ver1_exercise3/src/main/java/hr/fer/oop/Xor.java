package hr.fer.oop;

public class Xor {
    public static String calculateXor(String s1, String s2) {
        return(Integer.toBinaryString(Integer.parseInt(s1,2) ^ Integer.parseInt(s2, 2)));
    }
}
