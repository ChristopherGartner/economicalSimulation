import util.Calculator;

/**
 * Main class for simulation
 */
public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        Company fooCompany = new Company("foo_1");
        fooCompany.set_companyName("Foo Company");

        long revenue = calculator.calculateRevenue(313, 100213);
        long profit  = calculator.calculateProfit(revenue, 1466);

        System.out.println("Revenue: " + revenue);
        System.out.println("Profit: " + profit);
    }
}