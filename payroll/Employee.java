package payroll;

/*****************************************************************************
 * An abstract class representing an employee
 *****************************************************************************/
import java.util.*;

public abstract class Employee
{
    // The employee's name.
    protected String  name;
    
    // The employee's number.
    protected String  employeeNumber;
    
    // The employee's rate of pay.
    protected double  rateOfPay;
    
    // The employee's calcuated gross pay.
    protected double  grossPay;
    
    // The list of deductions associated with the employee.
    protected List    deductions = new ArrayList();

    /*************************************************************************
     * Constructs an employee.
     * 
     * @param name The name of the employee.
     * @param employeeNumber The employee's number.
     * @param rateOfPay The employee's rate of pay.
     *************************************************************************/
    public Employee( String  name,
                     String  employeeNumber,
                     double  rateOfPay )
    {
        this.name           = name;
        this.employeeNumber = employeeNumber;
        this.rateOfPay      = rateOfPay;
    }

    /*************************************************************************
     * Adds a deduction to the employee's list of deductions.
     * 
     * @param deduction The deduction.
     *************************************************************************/
    public void addDeduction( Deduction deduction )
    {
        this.deductions.add( deduction );  
    }
    
    /*************************************************************************
     * Returns the employee's name.
     * 
     * @return The employees name.
     *************************************************************************/
    public String getName()
    {
        return this.name;
    }
    
    /*************************************************************************
     * Returns the employee's number.
     * 
     * @return The employee's number.
     *************************************************************************/
    public String getEmployeeNumber()
    {
        return this.employeeNumber;
    }

    /*************************************************************************
     * Calculates the employee's gross pay.
     * 
     * @return The employee's pay.
     *************************************************************************/
    public abstract double getGrossPay();
    

    /*************************************************************************    
     * Calculates the employee's net pay.
     * 
     * @return The employees net pay.
     *************************************************************************/
    public double getAAAPay()
    {
        return this.grossPay - this.getTotalDeductions();
    }

    /*************************************************************************
     * Calculates the cost of all the employee's deductions.
     * 
     * @return The employees total deductions.
     *************************************************************************/
    public double getTotalDeductions()
    {
        double totalDeductions = 0.0;
        
        Iterator it = this.deductions.iterator();
        
        while( it.hasNext() )
        {
            Deduction d = (Deduction)it.next();
            totalDeductions = totalDeductions + (this.grossPay * d.getPercentage() );
        }
        
        return totalDeductions;
    }

    /*************************************************************************
     * Returns true if the employee is hourly employee that is paid according
     * to an hourly rate, or false if the employee is salary employee that is
     * paid according to an annual rate.
     * 
     * @return <code>true</code> if the employee is hourly,
     * <code>false</code> otherwise.
     *************************************************************************/
    public abstract boolean isHourly();

    /*************************************************************************
     * Returns the employee in a readable format.
     * 
     * @return A string representing the employee.
     *************************************************************************/
    @Override
    public String toString()
    {
        StringBuilder buffer = new StringBuilder();
        
        String paidWhen;
        
        if ( isHourly() )
        {
            paidWhen = " per hour";
        }
        else
        {
            paidWhen = " per year";
        }
        
        buffer.append( "-------------------------------------------------\n" );
        buffer.append("Name: ").append(this.name).append( "\n");
        buffer.append("Employee No.: ").append(this.employeeNumber).append( "\n");
        buffer.append("Rate of pay: $").append(this.rateOfPay).append(paidWhen).append( "\n");
        
        if ( this.deductions != null )
        {
            buffer.append( "Deductions:\n" );
            Iterator it = this.deductions.iterator();
            while ( it.hasNext() )
            {
                Deduction d = (Deduction)it.next();
                buffer.append( d.toString() );
            }
        }
        else
        {
            buffer.append( "No deductions\n" );
        }
        
        return buffer.toString();
    }
}
