public class DivisibilityBy3 {
    public static boolean isDivisibleBy3(int num) {
        num = Math.abs(num); 
        int sum = 0;

        while (num > 0) {
            sum += num % 10;  
            num /= 10;   
        }

        return sum % 3 == 0; 
    }

    public static void main(String[] args) {
        int num = 27;  
        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }
}
