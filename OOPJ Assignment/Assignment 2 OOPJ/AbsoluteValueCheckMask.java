public class AbsoluteValueCheckMask {
    public static void main(String[] args) {
        int num = -15;
        int mask = num >> 31;  // 0 for positive, -1 for negative
        int absoluteValue = (num + mask) ^ mask;
        
        System.out.println("Absolute value of " + num + " is: " + absoluteValue);
    }
}