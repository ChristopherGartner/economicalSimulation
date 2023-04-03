/**
 * Data class for a basic company
 */
public class Company
{
    private long _soldUnitsPerQuarter;
    private long _priceForUnit;
    private long _costsPerQuarter;

    private long _marketCap;

    private String _companyName;
    private String _id;

    /**
     * Constructor
     *
     * @param id String
     */
    public Company(String id)
    {
        this._soldUnitsPerQuarter = 0;
        this._priceForUnit        = 0;
        this._costsPerQuarter     = 0;
        this._companyName         = "INITIALIZED";
        this._marketCap           = 0;
        this._id                  = id;
    }

    /**
     * Set method for sold units per quarter
     *
     * @param soldUnitsPerQuarter long
     */
    public void set_soldUnitsPerQuarter(long soldUnitsPerQuarter)
    {
        this._soldUnitsPerQuarter = soldUnitsPerQuarter;
    }

    /**
     * Set method for price for unit
     *
     * @param priceForUnit long
     */
    public void set_priceForUnit(long priceForUnit)
    {
        this._priceForUnit = priceForUnit;
    }

    /**
     * Set method for costs per quarter
     *
     * @param costsPerQuarter long
     */
    public void set_costsPerQuarter(long costsPerQuarter)
    {
        this._costsPerQuarter = costsPerQuarter;
    }

    /**
     * Set method for company name
     *
     * @param companyName String
     */
    public void set_companyName(String companyName)
    {
        this._companyName = companyName;
    }

    /**
     * Set method for id
     *
     * @param id String
     */
    public void set_id(String id)
    {
        this._id = id;
    }

    /**
     * Set method for market cap
     *
     * @param marketCap long
     */
    public void set_marketCap(long marketCap)
    {
        this._marketCap = marketCap;
    }

    /**
     * Get method for sold units per quarter
     *
     * @return long
     */
    public long get_soldUnitsPerQuarter()
    {
        return this._soldUnitsPerQuarter;
    }

    /**
     * Get method for price for unit
     *
     * @return long
     */
    public long get_priceForUnit()
    {
        return this._priceForUnit;
    }

    /**
     * Get method for costs per quarter
     *
     * @return long
     */
    public long get_costsPerQuarter()
    {
        return this._costsPerQuarter;
    }

    /**
     * Get method for company name
     *
     * @return String
     */
    public String get_companyName()
    {
        return this._companyName;
    }

    /**
     * Get method for id
     *
     * @return String
     */
    public String get_id()
    {
        return this._id;
    }

    /**
     * Get method for market cap
     *
     * @return long
     */
    public long get_marketCap()
    {
        return this._marketCap;
    }
}
