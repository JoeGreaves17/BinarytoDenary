import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the bit with weight 8:");
        int digitValue8 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter the bit with weight 4:");
        int digitValue4 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter the bit with weight 2:");
        int digitValue2 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter the bit with weight 1:");
        int digitValue1 = Integer.parseInt(input.nextLine());
        System.out.println("Denary: " + String.valueOf((digitValue8 * 8) + (digitValue4 * 4) + (digitValue2 * 2) + digitValue1));
        System.out.println("Changes to program");
    }
}