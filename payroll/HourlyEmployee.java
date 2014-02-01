package payroll;

/*****************************************************************************
 * A class representing an hourly employee
 *****************************************************************************/
public class HourlyEmployee
    extends Employee
{
    // Hours worked this pay period.
    private double hoursWorked;

    /*************************************************************************
     * Constructs a hourly employee.
     * 
     * @param name The name of the employee.
     * @param employeeNumber The employee's number.
     * @param rateOfPay The employee's rate of pay.
     *************************************************************************/
    public HourlyEmployee( String  name,
                           String  employeeNumber,
                           double  rateOfPay )
    {
        super( name, employeeNumber, rateOfPay );
        this.hoursWorked = 0;
    }

    /*************************************************************************
     * Returns hours worked this pay period.
     * 
     * @return The hours the employee worked.
     *************************************************************************/
    public double getHoursWorked()
    {
        return this.hoursWorked;
    }

    /*************************************************************************
     * Sets hours worked this pay period.
     * 
     * @param hoursWorked The hours worked.
     ********************************************************
