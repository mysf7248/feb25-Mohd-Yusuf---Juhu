public class PassFailTernary {
    public static void main(String[] args) {
        int percentage = 39;
        String status = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("Student result: " + status);
    }
}
