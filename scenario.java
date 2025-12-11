
/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario
{
    public static void main(String[] args) {

        int principal = 50000;   
        double rate = 0.08;       
        int years = 3;            

        double amount = principal * Math.pow(1 + (rate / 12), 12 * years);

        double interest = amount - principal;


        System.out.println("----- Compound Interest (Monthly) -----");
        System.out.println("Principal: Rs. " + principal);
        System.out.println("Rate: " + (rate * 100) + "%");
        System.out.println("Time: " + years + " years");
        System.out.println("Total Amount: Rs. " + String.format("%.2f", amount));
        System.out.println("Interest Earned: Rs. " + String.format("%.2f", interest));
    }
}