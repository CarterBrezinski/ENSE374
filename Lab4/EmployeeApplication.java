/**
 * @author Trevor Douglas 190103730, Carter Brezinski 200391111
 *
 * @version     1.0                 (current version number of program)
 */
 
 /**
* Importing of the java scanner utility
*/
import java.util.Scanner;

/**
* Employee Application Class
*
* This application will prompt the user to enter the employee information, and then sort
* all employees alphabetically by their last name.
*
* The printed results from sorting the employee applications by database will be returned.
*/
public class EmployeeApplication{

	/**
	* The number of employees constant.
	*
	* This constant is called upon by various functions in this java applcation.
	*/
	static final int NUMEMPLOYEES = 3;

	/**
	* Main function
	*
	* Within the main function is the entire process for entering and displaying the employee database.
	* 
	* @param args - inclusion of string arguments.
	*
	* The main function does not return anything, but it does call upon the print functions for each database.
	*/
	public static void main(String[] args)
    {
		/**
		* Instantiation of the Employee database class
		*
		* One requirement is the NUMEMPLOYEES constant.
		*/
    	Employee[] employeeDatabase = new Employee[NUMEMPLOYEES];
		
		/**
		* Creating the employee application.
		*/
		EmployeeApplication employeeApp = new EmployeeApplication();
		
		/**
		* Adding entries to the employee application.
		*/
		employeeApp.addEntries(employeeDatabase);
		
		/**
		* Explains to the user that what is being shown is the entered employee database
		*/
		System.out.println("\n-----Employee Database----- ");
		
		/**
		* Prints out the previously prompted employee database.
		*/
		employeeApp.prints(employeeDatabase);
		
		/**
		* 
		*/
		Employee[] sortedDatabase = new Employee[NUMEMPLOYEES];
		
		/**
		* 
		*/
		sortedDatabase = employeeApp.sortByName(employeeDatabase,NUMEMPLOYEES);
		
		/**
		* 
		*/
		System.out.println("\n-----Sorted Employee Database-----");
		
		/**
		* 
		*/
		employeeApp.prints(sortedDatabase);

    }

	/**
	* Sort the database by users last name
	*
	* @param database - initial employee database
	* @param databaseSize - the size of the database
	*
	* @return Return the sorted database
	*/
	public Employee[] sortByName(Employee[] database, int databaseSize)
    {
		/**
		* This loop will go through the list of databases, and sort them via 
		* the employees last names.
		*
		* This loop will continue while integer i is less than the given constant NUMEMPLOYEES
		*/
        Employee[] sortDatabase = database;
        for(int i=1; i<(databaseSize); i++)
        {
            for(int j=0; j<(databaseSize-i); j++)
            {
                if (sortDatabase[j].getLastName().compareTo(sortDatabase[j+1].getLastName())>0)
                {
                    Employee temp = sortDatabase[j+1];
                    sortDatabase[j+1] = sortDatabase[j];
                    sortDatabase[j] = temp;
                }
            }
        }
        return sortDatabase;
    }
	
	/**
	* Sort the database by users last name
	*
	* @param employeeDatabase - the initial employee database
	*
	* Returning the sorted database to the main function.
	*/
	public void addEntries(Employee[] employeeDatabase)
	{
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < NUMEMPLOYEES; ++i)
		{
			/**
			* Prompting user for inputs
			* Then inputting those values into the variables.
			*/
			employeeDatabase[i] = new Employee();
			System.out.print("Enter an Employee's First Name: ");
			String firstName = input.nextLine();
			System.out.print("Enter an Employee's Last  Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter an Employee's Address: ");
			String address = input.nextLine();
			System.out.print("Enter an Employee's Phone Number: ");
			String phoneNum = input.nextLine();
			System.out.print("Enter an Employee's Hire Date: ");
			String hireDate = input.nextLine();
			System.out.print("Enter an Employee's starting Salary: ");
			String startingSalary = input.nextLine();

			/**
			* entering variable entries into the database.
			*/
			employeeDatabase[i].addEntries(firstName, lastName, address,  phoneNum, hireDate,  startingSalary);

		}
	}
	
	/**
	* Print the given database
	*
	* @param employeeDatabase - the initial employee database.
	*
	* No returns, but the database is printed for the user.
	*/
	public void prints(Employee[] employeeDatabase)
	{
		for (int i = 0; i < NUMEMPLOYEES; ++i)
		{

			employeeDatabase[i].printEmployeeData();

		}

	}

}
