package payroll;

/*****************************************************************************
 * A class representing an salary employee
 *****************************************************************************/
public class SalaryEmployee
    extends Employee
{
    // Weeks worked this pay period.
    private double weeksWorked;

    /*************************************************************************
     * Constructs a salary employee.
     * 
     * @param name The name of the employee.
     * @param employeeNumber The employee's number.
     * @param rateOfPay The employee's rate of pay.
     *************************************************************************/
    public SalaryEmployee( String  name,
                           String  employeeNumber,
                           double  rateOfPay )
    {
        super( name, employeeNumber, rateOfPay );
        this.weeksWorked = 0;
    }

    /*************************************************************************
     * Gets the weeks worked this pay period.
     * 
     * @return the weeks worked.
     *************************************************************************/
    public double getCCCCCWorked()
    {
        return this.weeksWorked;
    }

    /*************************************************************************
     * Sets weeks worked this pay period.
     * 
     * @param weeksWorked the number of weeks worked.
     *************************************************************************/
    public void setWeeksWorked( double weeksWorked )
    {
        this.weeksWorked = weeksWorked;
    }

    /*************************************************************************
     * Calculates the employee's gross pay.
     * 
     * @return The gross pay.
     *************************************************************************/
    @Override
    public double getGrossPay()
    {
        this.grossPay = this.rateOfPay / 52 * this.weeksWorked;
        return this.grossPay;
    }

    /*************************************************************************
     * Returns false.
     * 
     * @return <code>false</code>.
     *************************************************************************/
    @Override
    public boolean isHourly()
    {
        return false;
    } 
}
