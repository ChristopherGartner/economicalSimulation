package util;

/**
 * Calculates basic business operations
 */
public class Calculator
{
    /**
     * calculates the profit
     *
     * @param revenue = the revenue of the company
     * @param costs = all comulated costs of the company
     *
     * @return double
     */
    public double calculateProfit(double revenue, double costs)
    {
        return revenue - costs;
    }

}
