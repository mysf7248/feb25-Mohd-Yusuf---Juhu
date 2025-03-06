public class CharacterTypeTernary {
    public static void main(String[] args) {
        char ch = 'A';
        String charType = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
        System.out.println("Character type: " + charType);
    }
}
