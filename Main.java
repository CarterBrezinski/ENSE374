/**
 * ENSE 374 Lab 4 
 * Project - create a 2D Ecosystem environment in which organisms will randomly be placed, use polymorphism and inheritance to your advantage.
 *
 * @author Carter Brezinski
 */
 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean exitLoop = false;
		boolean addOrganism = false;

		int organismIdentification = 0;
		System.out.println("------------------------------------------------------------------");
		System.out.println("Welcome to the Saskatchewan Wildlife Cycle Program");
		System.out.println("This will simulate a live ecosystem and the organisms that live within it");
		System.out.println("Let's Begin!");
		
		System.out.println("");
		System.out.println("Generating an ecosystem field in a 20x20 grid...");
		System.out.println("");
		System.out.println("Ecosystem generating, begin placing organisms into the ecosystem: ");
		System.out.println("------------------------------------------------------------------");
		
		int horizontalSize = 20;
		int verticalSize = 20;
		
		Ecosystem testEcosystem = new Ecosystem(horizontalSize,verticalSize);
		while(!exitLoop)
		{
			addOrganism = true;
			System.out.println("");
			System.out.println("Enter the name of an organism to add it to the field,");
			System.out.println("Or enter \"List\" to view the list of organisms, or \"X\" to exit the program");
			String inputStr = input.nextLine();
			Organism newOrganism = null;
			switch(inputStr)
			{
			case "List" :
				addOrganism = false;
				System.out.println("List of Organisms:");
				System.out.println("- Bluejay");
				System.out.println("- Caterpillar");
				System.out.println("- Deer");
				System.out.println("- Fox");
				System.out.println("- Grass");
				System.out.println("- Grasshopper");
				System.out.println("- Hawk");
				System.out.println("- Mouse");
				System.out.println("- Rabbit");
				System.out.println("- Shrub");
				System.out.println("- Squirrel");
				System.out.println("- Tree");
				System.out.println("- Wolf");
				break;
			case "X" :
				exitLoop = true;
				addOrganism = false;
				break;
			case "Bluejay" :
				newOrganism = new Bluejay(organismIdentification);
				break;
			case "Caterpillar" :
				newOrganism = new Caterpillar(organismIdentification);
				break;
			case "Deer" :
				newOrganism = new Deer(organismIdentification);
				break;
			case "Fox" :
				newOrganism = new Fox(organismIdentification);
				break;
			case "Grass" :
				newOrganism = new Grass(organismIdentification);
				break;
			case "Grasshopper" :
				newOrganism = new Grasshopper(organismIdentification);
				break;
			case "Hawk" :
				newOrganism = new Hawk(organismIdentification);
				break;
			case "Mouse" :
				newOrganism = new Mouse(organismIdentification);
				break;
			case "Rabbit" :
				newOrganism = new Rabbit(organismIdentification);
				break;
			case "Shrub"  :
				newOrganism = new Shrub(organismIdentification);
				break;
			case "Squirrel" :
				newOrganism = new Squirrel(organismIdentification);
				break;
			case "Tree":
				newOrganism = new Tree(organismIdentification);
				break;
			case "Wolf":
				newOrganism = new Wolf(organismIdentification);
				break;
			default:
				System.out.println("Command is not recognised");
				addOrganism = false;
			}
			if(addOrganism)
			{
				testEcosystem.randomInsert(newOrganism);
				organismIdentification++;
				testEcosystem.display();
			}
		}
		input.close();
	}
}
