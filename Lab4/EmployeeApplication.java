
/**
 * @Trevor Douglas 190103730
 * @version     1.0                 (current version number of program)
 *
 */
import java.util.Scanner;

public class EmployeeApplication{



	public static void main(String[] args)
    {
    	Employee[] employeeDatabase = new Employee[3];
		int databaseSize = 0;
		EmployeeApplication employeeApp = new EmployeeApplication();
		employeeApp.addEs(employeeDatabase);
		employeeApp.prints(employeeDatabase);
		Employee[] sortedDatabase = new Employee[3];
		sortedDatabase = employeeApp.sortedName(employeeDatabase,3);
		employeeApp.prints(sortedDatabase);

    }


	public Employee[] sortedName(Employee[] database, int databaseSize)
    {
        Employee[] sortDatabase = database;
        for(int i=1; i<(databaseSize); i++)
        {
            for(int j=0; j<(databaseSize-i); j++)
            {
                if (sortDatabase[j].getlN().compareTo(sortDatabase[j+1].getLastName())>0)
                {
                    Employee temp = sortDatabase[j+1];
                    sortDatabase[j+1] = sortDatabase[j];
                    sortDatabase[j] = temp;
                }
            }
        }
        return sortDatabase;
    }

	public void addEntries(Employee[] employeeDatabase)
	{
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; ++i)
		{
			employeeDatabase[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter an Employee's Address: ");
			String addr = input.nextLine();
			System.out.print("Enter an Employee's Phone Number: ");
			String phoneNum = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String startingSalary = input.nextLine();

			eD[i].setSTUFFUP(firstName, lastName, address,  phoneNum, hireDate,  startingSalary);



		}
	}

	public void prints(Employee[] employeeDatabase)
	{
		for (int i = 0; i < 3; ++i)
		{

			employeeDatabase[i].printEmployeeData();

		}

	}

}
