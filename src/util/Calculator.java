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
     * @return long
     */
    public long calculateProfit(long revenue, long costs)
    {
        return revenue - costs;
    }

    /**
     * calculates the revenue of a company
     *
     * @param pricePerUnit = the price per item that gets sold
     * @param soldUnits = the total number of sold items
     *
     * @return double
     */
    public long calculateRevenue(long pricePerUnit, long soldUnits)
    {
        return pricePerUnit * soldUnits;
    }

}
