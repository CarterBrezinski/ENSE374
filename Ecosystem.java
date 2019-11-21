/**
 * Ecosystem Class for 2D Ecosystem
 * @author Carter Brezinski
 */

public class Ecosystem {
	/**
	 * 2D array to show organisms in the ecosystem.
	 */
	Organism[][] grid;
	
	/**
	 * This integer is meant to house the total capacity the ecosystem can actually hold.
	 */
	int capacity;

	/**
	 * Integer for the total number of organisms present in the ecosystem.
	 */
	int totalOrganisms;
	
	/**
	 * This field is meant to hold the actual horizontal size for the ecosystem.
	 */
	int horizontalSize;

	/**
	 * This field is meant to hold the actual vertical size for the ecosystem.
	 */
	int verticalSize;

	/**
	 * Constructor for a new Ecosystem instance
	 * @param x the width of the Ecosystem
	 * @param y the length of the Ecosystem
	 */
	public Ecosystem(int x, int y) {
		horizontalSize = x;
		verticalSize = y;
		//The capacity is equal to the max number of spaces in the array.
		capacity = x*y;
		totalOrganisms = 0;
		grid = new Organism[horizontalSize][verticalSize];
		for (int xIndex = 0; xIndex < horizontalSize; xIndex++)
		{
			for (int yIndex = 0; yIndex < verticalSize; yIndex++)
			{
				grid[xIndex][yIndex] = null;
			}
		}
	}

	/**
	 * Inserts passed organism into the ecosystem
	 * The location in which it is placed is completely random.
	 * @param returns the Organism to insert
	 */
	public void randomInsert(Organism organism)
	{
		int randX;
		int randY;
		if(totalOrganisms < capacity)
		{
			totalOrganisms++;
			do {
				randX = (int)(Math.random() * (horizontalSize));
				randY = (int)(Math.random() * (verticalSize));
			}while
			(grid[randX][randY] != null);
			grid[randX][randY] = organism;
			organism.updatePos(randX, randY);
		}
		else
		{
			System.out.println("Ecosystem has reached capacity, cannot place any more organisms");
		}
	}
	
	/**
	 * The display will actually create the 2D array
	 */
	public void display()
	{
		//print top border
		System.out.print(' ');
		for(int horizontalPosition = 0; horizontalPosition < horizontalSize; horizontalPosition++)
		{
			System.out.print('-');
		}
		System.out.println(' ');

		//print grid content
		for(int verticalPosition = 0; verticalPosition < verticalSize; verticalPosition++)
		{
			System.out.print('|'); //print right side border
			for(int horizontalPosition = 0; horizontalPosition < horizontalSize; horizontalPosition++)
			{
				if(grid[horizontalPosition][verticalPosition] == null)
				{
					System.out.print(' ');
				}
				else
				{
					System.out.print(grid[horizontalPosition][verticalPosition].getSymbol());
				}
			}
			System.out.println('|'); //print left side border
		}

		//print bottom border
		System.out.print(' ');
		for(int horizontalPosition = 0; horizontalPosition < horizontalSize; horizontalPosition++)
		{
			System.out.print('-');
		}
		System.out.println(' ');

	}
}
