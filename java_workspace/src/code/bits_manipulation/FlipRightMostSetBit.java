package code.bits_manipulation;

public class FlipRightMostSetBit {
    public static void main(String[] args) {
        int a = 12;
        a = a & (a - 1);
        System.out.println("after flipping right rightmost set bit is :" + a);
    }
}