public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (Using temp): a = " + a + ", b = " + b);

        // Without using a temporary variable
        a = 2; b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (Without temp): a = " + a + ", b = " + b);
    }
}
