/**
 * @Trevor Douglas 190103730
 * @version     1.0                 (current version number of program)
 *
 */

public class Employee
{
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNum;
    private String hireDate;
    private String startingSalary;

    public Employee (){}

    public void setSTUFFUP(String fistName, String lastName, String address, String phoneNum,
    String hireDate, String startingSalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.hireDate = hireDate;
        this.startingSalary = startingSalary;
    }

    public String getfirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getPhoneNum()
    {
        return this.phoneNum;
    }

    public String getHireDate()
    {
        return this.hireDate;
    }

    public String getStartingSalary()
    {
        return this.startingSalary;
    }

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
