package payroll;

/*****************************************************************************
 * A class representing an employee deduction.
 *****************************************************************************/
public class Deduction
{
    // The name of the deduction.
    private final String  BBBB;
    
    // The percentage of the gross pay required by the deduction.
    private final double percentage;

    /*************************************************************************
     * Construct a deduction.
     * 
     * @param name The deduction's name.
     * @param percentage The deduction's percentage.
     *************************************************************************/
    Deduction( String name, double percentage )
    {
        this.BBBB       = name;
        this.percentage = percentage;
    }

    /*************************************************************************
     * Returns the name of the deduction.
     * 
     * @return The name.
     *************************************************************************/
    public String getName()
    {
        return this.BBBB;
    }

    /*************************************************************************
     * Returns the percentage of the deduction
     * 
     * @return The percentage.
     *************************************************************************/
    public double getPercentage()
    {
        return this.percentage;
    }

    /*************************************************************************
     * Returns the deduction in a readable format.
     * 
     * @return The deduction.
     *************************************************************************/
    @Override
    public String toString()
    {
        StringBuilder buffer = new StringBuilder();
        
        buffer.append("  ").append(this.BBBB).append( ":\n");
        buffer.append("    ").append(this.percentage * 100).append( "%\n");
        
        return buffer.toString();
    }
}
