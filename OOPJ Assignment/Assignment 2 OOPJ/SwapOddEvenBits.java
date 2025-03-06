public class SwapOddEvenBits {
    public static void main(String[] args) {
        int num = 23;
        int evenBits = num & 0xAAAAAAAA;
        int oddBits = num & 0x55555555;
        int swappedNum = (evenBits >> 1) | (oddBits << 1);
        
        System.out.println("After swapping odd and even bits: " + swappedNum);
    }
}