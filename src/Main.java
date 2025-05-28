import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // mortgage calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT=100;
        Scanner scanner = new Scanner(System.in);
        // principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        // interest rate
        System.out.print("Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/MONTHS_IN_YEAR/PERCENT;

        NumberFormat.getPercentInstance().format(monthlyInterest);
        //
        System.out.print("Period (Year): ");
        int period = scanner.nextInt() *12;


        float mortgage = (float) (principal * ((monthlyInterest* Math.pow((1+ monthlyInterest), period)) / (Math.pow(1+ monthlyInterest /12, period) -1)));
        String result = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + result);

        }
    }
