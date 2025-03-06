public class AbsoluteValueCheck
 {
    public static void main(String[] args) {
        int num = -15;
        int absValue = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + absValue);
    }
}
