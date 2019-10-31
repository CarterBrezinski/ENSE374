/**
 * @author Trevor Douglas 190103730, Carter Brezinski 200391111
 *
 * @version     1.0                 (current version number of program)
 */

 
 /**
 * Employee Class
 *
 * Within this class, all user information will be present.
 */
public class Employee
{
	/**
	* Creation of Employee variables 
	*/
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNum;
    private String hireDate;
    private String startingSalary;

    public Employee (){}

	/**
	* add entries function
	*
	* @param firstName - the employees first name
	* @param lastName - the employees last name
	* @param address - the employees address
	* @param phoneNum - the employees phone number
	* @param hireDate - the hiring date of the employee
	* @param startingSalary - the starting salary of the user
	*/
    public void addEntries(String firstName, String lastName, String address, String phoneNum,
    String hireDate, String startingSalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.hireDate = hireDate;
        this.startingSalary = startingSalary;
    }

	/**
	* getFirstName
	*
	* A getter function
	*
	* @return the first name of the database entry
	*/
    public String getfirstName()
    {
        return this.firstName;
    }

	/**
	* setFirstName
	*
	* A setter function
	*
	* @param firstName - the inputted first name of the user.
	*/
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
	
	/**
	* getLastNameName
	*
	* A getter function
	*
	* @return lastName - the last name of the database entry
	*/
    public String getLastName()
    {
        return this.lastName;
    }

	/**
	* getAddress
	*
	* A getter function
	*
	* @return address - the address of the database entry
	*/
    public String getAddress()
    {
        return this.address;
    }

	/**
	* getPhoneNum
	*
	* A getter function
	*
	* @return phoneNum - the phone number of the database entry
	*/
    public String getPhoneNum()
    {
        return this.phoneNum;
    }

	/**
	* getHireDate
	*
	* A getter function
	*
	* @return hireDate - the hiring date of the database entry
	*/
    public String getHireDate()
    {
        return this.hireDate;
    }

	/**
	* getStartingSalary
	*
	* A getter function
	*
	* @return startingSalary - the starting salary of the database entry
	*/
    public String getStartingSalary()
    {
        return this.startingSalary;
    }

	/**
	* Print function
	*
	* This function will print the current database
	*/
    public void printEmployeeData()
    {
        System.out.format(
            "Name: %s %s| addr: %s| Phone Number: %s|" +
            " Hire Date: %s| starting Salary: %s \n",
            this.firstName,
            this.lastName,
            this.address,
            this.phoneNum,
            this.hireDate,
            this.startingSalary);
    }
}
