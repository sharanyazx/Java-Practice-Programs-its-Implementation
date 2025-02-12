public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // n must be non zero and (n and (n-1)==0)
        return (n > 0) && ( (n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfTwo(num)); 
    }
}
