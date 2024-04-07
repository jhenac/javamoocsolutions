
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestNameCount = 0;
        String name = "";
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            int nameCount = parts[0].length();
            if (nameCount > longestNameCount){
                longestNameCount = nameCount;
                name = parts[0];
            }
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);
    }
}
