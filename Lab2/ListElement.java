/*
NAME: Carter Brezinski
SID: 200391111
DATE: 10/3/2019
ASSIGNMENT: Lab2 - phase1
*/

public class ListElement
{
	private ListElement next;
	private int data;

	public ListElement()
	{
		this.data = 0;
		this.next = null;
		//this.previous = null;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public int getData()
	{
		return this.data;
	}
	/*
	public void remove(int data)
	{
		
	}
	
	public void addElement(ListElement le)
	{	
		
	}
	*/
}
