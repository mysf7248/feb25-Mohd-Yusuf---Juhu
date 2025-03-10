public class ReverseInteger {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}
