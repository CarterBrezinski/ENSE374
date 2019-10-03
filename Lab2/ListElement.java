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
		//if the head, the next in list will become the head	
		//if the tail, the one before it will become the tail
		//if in the center, you'll have to link the two on either end
		
	}
	*/
	public void addElement(ListElement le)
	{	
		//Traverse all the way to the tail, then add:
		while (this.next != null)
		{
			this = this.next;
		}
		next = le;
	}
	
	public void print()
	{
		//Printing the linked list one by one from head -> tail
		
	}
	
	
}
