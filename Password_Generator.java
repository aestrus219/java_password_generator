import java.util.Random;
import java.util.Scanner;

public class Password_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enable numbers?\n[1] Yes\n[2] No");
        int n = sc.nextInt();
        System.out.println("Enable alphabets?\n[1] Yes\n[2] No");
        int a = sc.nextInt();
        System.out.println("Enable special characters?\n[1] Yes\n[2] No");
        int s = sc.nextInt();
        System.out.println("Please enter the length of the password. Minimum is 5 and Maximum is 20");
        int l = sc.nextInt();
        String alpha = "";
        String alpha_smol = "";
        String nos = "";
        String character = "";
        switch (n) {
            case 1:
                nos = "0123456789";
                break;
            case 2:
                break;
            default:
                break;
        }
        switch (a) {
            case 1:
                alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                alpha_smol = "abcdefghijklmnopqrstuvwxyz";
                break;
            case 2:
                break;
            default:
                break;
        }
        switch (s) {
            case 1:
                character = "!@#$%^&*()_+?/|~.";
            case 2:
                break;
            default:
                break;
        }
        String combined = alpha + alpha_smol + nos + character;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            int index = random.nextInt(combined.length());
            char randomChar = combined.charAt(index);
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Generated Password: " + randomString);
    }
}