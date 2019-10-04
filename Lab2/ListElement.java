/*
NAME: Carter Brezinski
SID: 200391111
DATE: 10/3/2019
ASSIGNMENT: Lab2 - phase1
*/

public class ListElement
{
	ListElement head;

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
		ListElement pointer = this;

		if (this.next == null)
		{
			this.next = le;
		}
		else
		{
			while (pointer.next != null)
			{
			ListElement nextObject = pointer.next;
			pointer = nextObject;
			}
		pointer.next = le;
		}
	}
	
	public void printList()
	{
		ListElement pointer = this;

		while(pointer.next != null)
		{
			System.out.println(pointer.data);
			ListElement nextObject = pointer.next;
			pointer = nextObject;
		}
		if(pointer.next == null)
		{
			System.out.println(pointer.data);
		}
	}
}
